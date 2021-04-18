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
    }
}
