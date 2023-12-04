package org.campus02.palindrom;

public class DemoApp {
    public static void main(String[] args) {

        String palindrom = "2332";
        String palindrom2 = "Trug Tim eine so helle Hose nie mit Gurt?"; // Alles, außer Buchstaben ignonieren

        System.out.println("check(palindrom) = " + check(palindrom2));
    }
    
    public static boolean check(String palindrom){

        System.out.println("palindrom = " + palindrom);

        if (palindrom.length() < 2)
            return true; // hier muss es per definition ein palindrom sein

        char first = palindrom.charAt(0);

        if (!Character.isLetterOrDigit(first)) {
            // kein Buchstabe und keine Zahl ist
            palindrom = palindrom.substring(1, palindrom.length());
            return check(palindrom);
        }

        char last = palindrom.charAt(palindrom.length() - 1);
        if (!Character.isLetterOrDigit(last)) {
            // kein Buchstabe und keine Zahl ist
            palindrom = palindrom.substring(0, palindrom.length() - 1);
            return check(palindrom);
        }

        if (Character.toLowerCase(first) == Character.toLowerCase(last)) {
            palindrom = palindrom.substring(1, palindrom.length() - 1);
            
            return check(palindrom);
        }
        else 
            return false;
    }
}
