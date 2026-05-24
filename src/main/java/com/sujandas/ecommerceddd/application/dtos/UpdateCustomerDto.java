package com.sujandas.ecommerceddd.application.dtos;

public class UpdateCustomerDto {


    private  String firstName;
    private  String lastName;
    private  String email;
    private  String contactNumber;

    public UpdateCustomerDto() {
    }

    public UpdateCustomerDto( String firstName, String lastName, String email, String contactNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
