package com.adventureworks.org.service.impl;

import com.adventureworks.org.model.Address;
import com.adventureworks.org.repository.AddressRepository;
import com.adventureworks.org.service.contract.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Mono<Address> findById(Integer id) {
        return addressRepository.findById(id);
    }

    @Override
    public Flux<Address> findByZipCode(Integer zipCode) {
        return addressRepository.findByPostalCode(zipCode);
    }

    @Override
    public Flux<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Mono<Address> save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return addressRepository.deleteById(id);
    }
}
