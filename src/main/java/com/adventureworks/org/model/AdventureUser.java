package com.adventureworks.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "adventureuser")
public class AdventureUser {
    @Id
    @Column("userId")
    private Integer userId;

    @Column("EmployeeID")
    private Integer employeeId;

    @Column("password")
    private String password;

    @Column("dateModified")
    private LocalDateTime dateModified;
}
