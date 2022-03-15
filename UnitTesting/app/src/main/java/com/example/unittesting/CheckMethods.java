package com.example.unittesting;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMethods {

    private static String passwordPattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()â€\"[{}]:;',?/*~$^+=<>]).{6,20}$";
    private  static String emailPattern ="([A-Za-z0-9]{1,}[\\.-]{0,1}[A-Za-z0-9]{1,})+@([A-Za-z0-9]{1,}[\\.-]{0,1}[A-Za-z0-9]{1,})+[\\.]{1}[a-z]{2,4}";
public static boolean checkPassword(String Password)
{
if(Password.matches(passwordPattern)) {return true;}
    return false;
}

public static boolean emailValid(String email)
{
    if(email.matches(emailPattern)){return true;}
    return false;
}

}
