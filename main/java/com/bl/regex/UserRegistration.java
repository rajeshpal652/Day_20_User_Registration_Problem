package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean checkPassword(String password){
        boolean check = Pattern.matches("\\w{8,}", password);
        return check;
    }
}
