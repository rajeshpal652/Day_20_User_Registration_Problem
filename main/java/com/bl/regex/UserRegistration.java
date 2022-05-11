package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean checkPassword(String password){
        boolean check = Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$", password);
        return check;
    }
}
