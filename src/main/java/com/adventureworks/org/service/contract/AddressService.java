package com.adventureworks.org.service.contract;

import com.adventureworks.org.model.Address;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AddressService {
    Mono<Address> findById(Integer id);

    Flux<Address> findByZipCode(Integer zipCode);
    Flux<Address> findAll();
    Mono<Address> save(Address address);
    Mono<Void> delete(Integer id);
}
