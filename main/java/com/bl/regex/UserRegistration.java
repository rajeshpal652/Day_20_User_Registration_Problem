package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean lastName(String name){
        boolean check = Pattern.matches("([A-Z][a-z]{2,})",name);
        return check;
    }
}
