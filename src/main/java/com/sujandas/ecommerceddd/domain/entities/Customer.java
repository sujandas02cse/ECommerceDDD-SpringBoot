package com.sujandas.ecommerceddd.domain.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table (name="customers")
public class Customer {


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(nullable = false,length = 100)
    private  String firstName;

    @Column(length = 100)
    private  String lastName;

    @Column(nullable = false)
    @Email
    @NotBlank
    private  String email;

    @NotBlank
    @Size(max=20)
    @Pattern(regexp = "^[0-9+\\- ]+$")
    @Column(nullable = false,length = 20)
    private  String contactNumber;
}
