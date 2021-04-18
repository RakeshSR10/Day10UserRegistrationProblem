package com.newBridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        Scanner scanner = new Scanner(System.in);

        //UC1 User need to enter valid First Name
        String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println("Enter First Name:");
        String First_Name = scanner.next();

        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(First_Name);

        boolean result = matcher.matches();
        if(result == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        //UC2 User need to enter valid Last Name
        String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println("Enter Last Name:");
        String Last_Name = scanner.next();

        Pattern pattern1 = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher1 = pattern1.matcher(Last_Name);

        boolean result1 = matcher1.matches();
        if(result1 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        //UC3 User need to enter valid Email
        String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*" +
                                "@([0-9a-zA-Z][-]?)+[_][a-zA-z]{2,4}([.][a-zA-Z]{2,4})*$";
        System.out.println("Enter your Email:");
        String email = scanner.next();

        Pattern pattern2 = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher2 = pattern2.matcher(email);

        boolean result2 = matcher2.matches();
        if(result2 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }
}
