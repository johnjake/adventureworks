package com.adventureworks.org.service.impl;

import com.adventureworks.org.model.Employee;
import com.adventureworks.org.model.aggregate.EmployeeStateCount;
import com.adventureworks.org.repository.EmployeeRepository;
import com.adventureworks.org.service.contract.EmployeeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Flux<Employee> findEmployeesByCity(String city) {
        return employeeRepository.findEmployeesByCity(city);
    }

    @Override
    public Flux<EmployeeStateCount> countEmployeePerCity() {
        return employeeRepository.countEmployeeInCity();
    }
}
