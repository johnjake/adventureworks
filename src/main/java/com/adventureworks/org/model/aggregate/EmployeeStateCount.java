package com.adventureworks.org.model.aggregate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeStateCount {
    @Column("City")
    private String city;

    @Column("employee_count")
    private int noEmployee;
}
