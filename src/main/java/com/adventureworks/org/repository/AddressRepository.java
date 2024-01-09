package com.adventureworks.org.repository;

import com.adventureworks.org.model.Address;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface AddressRepository extends ReactiveCrudRepository<Address, Integer> {
    Flux<Address> findByPostalCode(Integer postalCode);
}
