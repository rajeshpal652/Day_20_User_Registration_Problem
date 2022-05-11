package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAPasswordPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean password = user.checkPassword("Xxxxxxx9");
        Assert.assertTrue(password);
    }
}
