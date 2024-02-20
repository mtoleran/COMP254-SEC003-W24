import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalindrome(String input){
        String strToCheck = input.toLowerCase();
        if(strToCheck.isEmpty() || strToCheck.length() == 1 ){
            return true;
        }
        if(strToCheck.charAt(0) == strToCheck.charAt(strToCheck.length() - 1)){
            return checkPalindrome(strToCheck.substring(1,strToCheck.length() - 1));
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        if(checkPalindrome(input)){
            System.out.println(input + " is a palindrome");
        }
        else {
            System.out.println(input + " is not a palindrome");
        }

    }
}
