package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean name = user.firstName("Rajesh");
        Assert.assertTrue(name);
    }
}
