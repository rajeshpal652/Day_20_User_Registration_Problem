package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean emailCheck(String email) {
        boolean check = Pattern.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}", email);
        return check;
    }
}
