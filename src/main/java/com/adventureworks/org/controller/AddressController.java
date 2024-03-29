package com.adventureworks.org.controller;

import com.adventureworks.org.model.Address;
import com.adventureworks.org.service.contract.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Address>> getAddressById(@PathVariable Integer id) {
        return addressService.findById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/by-postalcode/{postalCode}")
    public Flux<Address>getAddressByPostalCode(@PathVariable Integer postalCode) {
        return addressService.findByZipCode(postalCode);
    }

    @GetMapping("/all")
    public Flux<Address> getAllAddresses() {
        return addressService.findAll();
    }

    @PostMapping("/add")
    public Mono<Address> createAddress(@RequestBody Address address) {
        return addressService.save(address);
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> deleteAddress(@PathVariable Integer id) {
        return addressService.delete(id)
                .then(Mono.just(ResponseEntity.ok().<Void>build()))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
