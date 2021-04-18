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
        String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9]+)*@"+"(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";
        System.out.println("Enter your Email:");
        String email = scanner.next();

        Pattern pattern2 = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher2 = pattern2.matcher(email);

        boolean result2 = matcher2.matches();
        if(result2 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        //UC4 User need to enter valid Mobile Number
        String MOBILE_NUMBER_PATTERN = "^((91[: :])+([0-9]{10}))$";
        System.out.println("Enter your Mobile Number:");
        String mobile_Number = scanner.next();

        Pattern pattern3 = Pattern.compile(MOBILE_NUMBER_PATTERN);
        Matcher matcher3 = pattern3.matcher(mobile_Number);

        boolean result3 = matcher3.matches();
        if(result3 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        //UC5 User need to enter valid Password with atleast 8 minimum character
        String PASSWORD_PATTERN = "^[a-zA-Z0-9~!@#$]{8,}$";
        System.out.println("Enter your Password:");
        String password = scanner.next();

        Pattern pattern4 = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher4 = pattern4.matcher(password);

        boolean result4 = matcher4.matches();
        if(result4 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        //UC6 User need to enter valid Password with at least one Uppercase
        String PASSWORD_PATTERN1 = "^([a-z0-9~!@#$]*[A-Z]){1}[0-9a-zA-Z~!@#$]*$";
        System.out.println("Enter your Password:");
        String password1 = scanner.next();

        Pattern pattern5 = Pattern.compile(PASSWORD_PATTERN1);
        Matcher matcher5 = pattern5.matcher(password1);

        boolean result5 = matcher5.matches();
        if(result5 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        //UC7 User need to enter valid Password with at least one numeric number
        String PASSWORD_PATTERN2 = "^([a-z~!@#$]*[0-9]){1}[0-9a-zA-Z~!@#$]*$";
        System.out.println("Enter your Password:");
        String password2 = scanner.next();

        Pattern pattern6 = Pattern.compile(PASSWORD_PATTERN2);
        Matcher matcher6 = pattern6.matcher(password2);

        boolean result6 = matcher6.matches();
        if(result6 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        //UC8 User need to enter valid Password with at Exactly one Special character
        String PASSWORD_PATTERN3 = "^([0-9a-zA-Z]*[~!@#$]){1}[0-9a-zA-Z~!@#$]*$";
        System.out.println("Enter your Password:");
        String password3 = scanner.next();

        Pattern pattern7 = Pattern.compile(PASSWORD_PATTERN3);
        Matcher matcher7 = pattern7.matcher(password3);

        boolean result7 = matcher7.matches();
        if(result7 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        //UC9 Should clear all email samples
        String email1 ="abc@yahoo.com";
        String email2 ="abc-100@yahoo.com";
        String email3 = "abc.100@yahoo.com";
        String email4 = "abc111@abc.com";
        String email5 = "abc-100@abc.net";
        String email6 ="abc.100@abc.com.au";
        String email7 ="abc@1.com";
        String email8 = "abc@gmail.com";
        String email9 = "abc+100@gmail.com";
        String email10 = "abc";
        String email11 = "abc@.com.my";
        String email12 = "abc123@gmail.a";
        String email13 = "abc123@.com";
        String email14 = "abc123@.com.com";
        String email15 = ".abc@abc.com";
        String email16 = "abc()*@gmail.com";
        String email17 = "abc@%*.com";
        String email18 = "abc..2002@gmail.com";
        String email19 = "abc.@gmail.com";
        String email20 = "abc@abc@gmail.com";
        String email21 = "abc@gmail.com.1a";
        String email22 = "abc@gmail.com.aa.au";

        String MULTIPLE_EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9]+)*@"+"(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";

        Pattern patterns1 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers1 = patterns1.matcher(email1);
        boolean results1 = matchers1.matches();
        System.out.println(results1);

        Pattern patterns2 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers2 = patterns2.matcher(email2);
        boolean results2 = matchers2.matches();
        System.out.println(results2);

        Pattern patterns3 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers3 = patterns3.matcher(email3);
        boolean results3 = matchers3.matches();
        System.out.println(results3);

        Pattern patterns4 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers4 = patterns4.matcher(email4);
        boolean results4 = matchers4.matches();
        System.out.println(results4);

        Pattern patterns5 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers5 = patterns5.matcher(email5);
        boolean results5 = matchers5.matches();
        System.out.println(results5);

        Pattern patterns6 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers6 = patterns6.matcher(email6);
        boolean results6 = matchers6.matches();
        System.out.println(results6);

        Pattern patterns7 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers7 = patterns7.matcher(email7);
        boolean results7 = matchers7.matches();
        System.out.println(results7);

        Pattern patterns8 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers8 = patterns8.matcher(email8);
        boolean results8 = matchers8.matches();
        System.out.println(results8);

        Pattern patterns9 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers9 = patterns9.matcher(email9);
        boolean results9 = matchers9.matches();
        System.out.println(results9);

        Pattern patterns10 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers10 = patterns10.matcher(email10);
        boolean results10 = matchers10.matches();
        System.out.println(results10);

        Pattern patterns11 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers11 = patterns11.matcher(email11);
        boolean results11 = matchers11.matches();
        System.out.println(results11);

        Pattern patterns12 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers12 = patterns12.matcher(email12);
        boolean results12 = matchers12.matches();
        System.out.println(results12);

        Pattern patterns13 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers13 = patterns13.matcher(email13);
        boolean results13 = matchers13.matches();
        System.out.println(results13);

        Pattern patterns14 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers14 = patterns14.matcher(email14);
        boolean results14 = matchers14.matches();
        System.out.println(results14);

        Pattern patterns15 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers15 = patterns15.matcher(email15);
        boolean results15 = matchers15.matches();
        System.out.println(results15);

        Pattern patterns16 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers16 = patterns16.matcher(email16);
        boolean results16 = matchers16.matches();
        System.out.println(results16);

        Pattern patterns17 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers17 = patterns17.matcher(email17);
        boolean results17 = matchers17.matches();
        System.out.println(results17);

        Pattern patterns18 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers18 = patterns18.matcher(email18);
        boolean results18 = matchers18.matches();
        System.out.println(results18);

        Pattern patterns19 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers19 = patterns19.matcher(email19);
        boolean results19 = matchers19.matches();
        System.out.println(results19);

        Pattern patterns20 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers20 = patterns20.matcher(email20);
        boolean results20 = matchers20.matches();
        System.out.println(results20);

        Pattern patterns21 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers21 = patterns21.matcher(email21);
        boolean results21 = matchers21.matches();
        System.out.println(results21);

        Pattern patterns22 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers22 = patterns22.matcher(email22);
        boolean results22 = matchers22.matches();
        System.out.println(results22);

    }
}
