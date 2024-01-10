package com.adventureworks.org.controller;

import com.adventureworks.org.model.Employee;
import com.adventureworks.org.service.contract.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{city}")
    public Flux<Employee> listEmployeePerCity(@PathVariable String city) {
        return employeeService.findEmployeesByCity(city);
    }
}
