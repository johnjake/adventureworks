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
@Table("Address")
public class Address {
    @Id
    @Column("AddressID")
    private Integer addressId;

    @Column("AddressLine1")
    private String addressLine1;

    @Column("AddressLine2")
    private String addressLine2;

    @Column("City")
    private String city;

    @Column("StateProvinceID")
    private Integer stateProvinceId;

    @Column("PostalCode")
    private String postalCode;

    @Column("rowguid")
    private byte[] rowguid;

    @Column("ModifiedDate")
    private LocalDateTime modifiedDate;
}
