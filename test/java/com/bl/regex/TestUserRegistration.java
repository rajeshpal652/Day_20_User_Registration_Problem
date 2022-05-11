package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAMobileNumberPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean number = user.numberCheck("91 7003321213");
        Assert.assertTrue(number);
    }
}
