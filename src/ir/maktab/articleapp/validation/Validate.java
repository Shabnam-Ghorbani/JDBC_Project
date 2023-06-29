package ir.maktab.articleapp.validation;

public class Validate {
    public static boolean isValidPassword(String password){
        //regex
        return password.matches("[\\w\\.]{8,16}");

    }
}
