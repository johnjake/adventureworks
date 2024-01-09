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
public class Contact {
    @Id
    @Column("ContactID")
    private Integer contactId;

    @Column("NameStyle")
    private Boolean nameStyle;

    @Column("Title")
    private String title;

    @Column("FirstName")
    private String firstName;

    @Column("MiddleName")
    private String middleName;

    @Column("LastName")
    private String lastName;

    @Column("Suffix")
    private String suffix;

    @Column("EmailAddress")
    private String emailAddress;

    @Column("EmailPromotion")
    private Integer emailPromotion;

    @Column("Phone")
    private String phone;

    @Column("PasswordHash")
    private String passwordHash;

    @Column("PasswordSalt")
    private String passwordSalt;

    @Column("AdditionalContactInfo")
    private String additionalContactInfo;

    @Column("rowguid")
    private boolean rowguid;

    @Column("ModifiedDate")
    private LocalDateTime modifiedDate;
}
