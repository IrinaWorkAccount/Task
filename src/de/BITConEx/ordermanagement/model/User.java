package de.BITConEx.ordermanagement.model;

/**
 * An abstract class that contains the common properties of users (Admin and Customer), such a login name, passwort and email.
 */


public abstract class User {
    private String loginName;
    private String email;
    private String password;

    //constructors
    //getters
    //setters
}

public class Admin extends User{
    //Methods specific to Admin users
}

public class Customer extends User{
    private String name;
    private String surname;
    private String birthDate;
    private String address;

    //constructors
    //getters
    //setters

}

