package ua.qa.auto.addressbook.model;

/**
 * Created by PDM-ko on 16.04.2018.
 */
public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String address;
    private final String mobile;
    private final String email;

    public ContactData(String firstname, String lastname, String address, String mobile, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }



}


