package com.sujandas.ecommerceddd.application.dtos;

public class CreateCustomerDto {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    private  String firstName;
private  String LastName;
private  String email;
private  String contactNumber;

    public CreateCustomerDto() {

    }

    public CreateCustomerDto(String firstName, String lastName, String email, String contactNumber) {
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
    }
}
