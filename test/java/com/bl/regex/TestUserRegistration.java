package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean lastName = user.lastName("Pal");
        Assert.assertTrue(lastName);
    }
}
