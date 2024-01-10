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
@Table("Contact")
public class Employee {
    @Id
    @Column("EmployeeID")
    private Integer employeeId;

    @Column("NationalIDNumber")
    private String nationalIdNumber;

    @Column("ContactID")
    private Integer contactId;

    @Column("LoginID")
    private String loginId;

    @Column("ManagerID")
    private Integer managerId;

    @Column("Title")
    private String title;

    @Column("BirthDate")
    private LocalDateTime birthDate;

    @Column("MaritalStatus")
    private String maritalStatus;

    @Column("Gender")
    private String gender;

    @Column("HireDate")
    private LocalDateTime hireDate;

    @Column("SalariedFlag")
    private Boolean salariedFlag;

    @Column("VacationHours")
    private Integer vacationHours;

    @Column("SickLeaveHours")
    private Integer sickLeaveHours;

    @Column("CurrentFlag")
    private Boolean currentFlag;

    @Column("rowguid")
    private byte[] rowguid;

    @Column("ModifiedDate")
    private LocalDateTime modifiedDate;
}
