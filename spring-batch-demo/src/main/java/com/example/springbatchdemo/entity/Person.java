package com.example.springbatchdemo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Persons")
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String country;
    private String dob;
}
