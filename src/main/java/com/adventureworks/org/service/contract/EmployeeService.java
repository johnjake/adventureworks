package com.adventureworks.org.service.contract;

import com.adventureworks.org.model.Employee;
import com.adventureworks.org.model.aggregate.EmployeeStateCount;
import reactor.core.publisher.Flux;

public interface EmployeeService {
    Flux<Employee> findEmployeesByCity(String city);
    Flux<EmployeeStateCount> countEmployeePerCity();
}
