package com.comp438.assignments.utils.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,name = "name")
    private String name;

    @Column(nullable = false,name = "phone")
    private String phone;

    @Column(nullable = false,name = "email")
    private String email;

    @Column(nullable = false,name = "address")
    private String address;
}
