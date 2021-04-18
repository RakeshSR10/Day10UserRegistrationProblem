package com.newBridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest
{
    @Test
    public void givenFirstName_whenProper_ShouldReturnHappy(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validateFirstName("Rakesh");
        String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenFirstName_whenShort_ShouldReturnSad(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validateFirstName("Ra");
        String mood = moodAnalyzer.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenFirstName_whenWithSpChars_ShouldReturnSad(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validateFirstName("R@kesh");
        String mood = moodAnalyzer.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validateFirstName("King");
        String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnSad(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validateFirstName("ki");
        String mood = moodAnalyzer.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenMobileNumber_whenProper_ShouldReturnHappy(){
        UserValidator userValidator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = userValidator.validateMobileNumber("91 9553754208");
        String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenMobileNumber_whenNotProper_ShouldReturnSad(){
        UserValidator userValidator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = userValidator.validateMobileNumber("95463__");
        String mood = moodAnalyzer.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenEmail_whenValid_ShouldReturnHappy(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validateEmailAddress("abc@bridgelabz.com");
        String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY",mood);

    }

    @Test
    public void givenEmail_whenNotValid_ShouldReturnSad(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validateEmailAddress("abc.com");
        String mood = moodAnalyzer.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD",mood);

    }
    @Test
    public void givenPassword_whenValid_ShouldReturnHappy(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validatePassword("Rakesh@king120");
        String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenPassword_whenNotValid_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = validator.validatePassword("rakesh");
        String mood = moodAnalyzer.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD",mood);
    }
}
