package com.fillopfy.rest.project.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="USER")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;

    @Column(name = "USER_NAME", length = 50, nullable = false, unique = true)
    private String userName;

    @Column(name="FIRST_NAME", length = 50, nullable = false)
    private String firstName;

    @Column(name="LAST_NAME", length = 50, nullable = false)
    private String lastName;

    @Column(name="EMAIL", length = 50, nullable = false)
    private String email;

    @Column(name = "ROLE", length = 50, nullable = false)
    private String role;

    @Column(name="SSN", length = 50, nullable = false, unique = true)
    private String ssn;
}
