package com.company;

public class Assignment3 {
    public static void main(String[] args) {
        onlyLetter();
        userName();
        codeOFLatvian();
    }

    public static void onlyLetter () {
        String name = "John";
        System.out.println(name.matches("[a-zA-Z]+"));
        if (name.matches("[a-zA-Z]+")){
            System.out.println("Name John contains only letters.");
            System.out.printf("%n");
        }
    }
    public static void userName () {
        String username = "s20surname";
        System.out.println(username.matches("[a-z][0-9]{2}[a-z]+"));
        if (username.matches("[a-z][0-9]{2}[a-z]+")) {
            System.out.println("Username is correct.");
        }
        System.out.printf("%n");
    }
    public static void codeOFLatvian () {
        String personCodeOfLatvian = "121200-11311";
        System.out.println(personCodeOfLatvian.matches("[0-9]{6}[-][0-9]{5}"));
        if (personCodeOfLatvian.matches("[0-9]{6}[-][0-9]{5}")) {
            System.out.println("The person code of Latvian is valid.");
        }
        System.out.printf("%n");

    }

}
