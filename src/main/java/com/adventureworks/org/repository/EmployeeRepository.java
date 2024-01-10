package com.adventureworks.org.repository;

import com.adventureworks.org.model.Employee;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {
    @Query("SELECT " +
            "e.EmployeeID, " +
            "e.NationalIDNumber, " +
            "e.ContactID, " +
            "e.LoginID, " +
            "e.ManagerID, " +
            "e.Title, " +
            "e.BirthDate, " +
            "e.MaritalStatus, " +
            "e.Gender, " +
            "e.HireDate, " +
            "e.SalariedFlag, " +
            "e.VacationHours, " +
            "e.SickLeaveHours, " +
            "e.CurrentFlag, " +
            "e.rowguid, " +
            "e.ModifiedDate " +
            "FROM employee e INNER JOIN employeeaddress ea ON e.EmployeeID = ea.EmployeeID INNER JOIN address a ON ea.AddressID = a.AddressID WHERE a.City = :city")
    Flux<Employee> findEmployeesByCity(String city);
}
