package com.CB20129.BUS;

public class UserModel {

    String EmailAddress, FullName, MatricID, Password, PhoneNumber, DriverID;

    public UserModel(){}

    public UserModel(String emailAddress, String fullName, String matricID, String password, String phoneNumber, String driverID) {
        EmailAddress = emailAddress;
        FullName = fullName;
        MatricID = matricID;
        Password = password;
        PhoneNumber = phoneNumber;
        DriverID = driverID;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getMatricID() {
        return MatricID;
    }

    public String getDriverID() {
        return DriverID;
    }

    public void setMatricID(String matricID) {
        MatricID = matricID;
    }
    public void setDriverID(String driverID) {
        DriverID = driverID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
