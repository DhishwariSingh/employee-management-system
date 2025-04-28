package com.gar.project.employee_management_system.model;

import jakarta.persistence.*;

@Entity //this class represents a database table
@Table(name = "employees") //Table name
public class Employee {
    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-increment id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    // Getter and Setter methods for all fields (needed to access/change data)


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    //Empty constructor required for JPA
    public Employee() {
    }

    //Full Constructor (useful when creating objects)
    public Employee(Long id, String firstName, String lastName, String email, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

}
