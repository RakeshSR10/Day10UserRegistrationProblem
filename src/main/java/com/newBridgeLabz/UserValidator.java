package com.newBridgeLabz;


import java.util.regex.Pattern;

public class UserValidator {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String MOBILE_NUMBER_PATTERN = "^((91[: :])+([0-9]{10}))$";
    private static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9]+)*@"+"(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@!#$~&%]).{8,}$";

    public  boolean validateFirstName(String fname){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public  boolean validateLastName(String lname){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public  boolean validateEmailAddress(String email){
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String mobile_Number){
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobile_Number).matches();
    }

    public boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
