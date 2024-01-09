package com.adventureworks.org.repository;

import com.adventureworks.org.model.Address;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AddressRepository extends ReactiveCrudRepository<Address, Integer> {
}
