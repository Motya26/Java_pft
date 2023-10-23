package ru.stqa.pft.addressbook.tests;

public record UserData(String firstname, String lastname, String address, String mobile, String email,
                       String dayOfBirth, String monthOfBirth, String yearOfBirth) {
}