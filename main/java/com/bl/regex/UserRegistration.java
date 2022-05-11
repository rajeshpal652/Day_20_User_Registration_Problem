package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean numberCheck(String number){
        boolean check = Pattern.matches("[9][1][\s][0-9]{10}",number);
        return check;
    }
}
