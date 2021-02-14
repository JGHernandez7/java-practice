import java.util.Scanner;

//Program to check if integer number is a palindrome.

public class PalindromeInt
{
    private static boolean checkPalindrome(int temp)
    {
        int num = temp;
        int reverse = 0;

        while (num != 0)
        {
            int remainder = num % 10;

            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        if (temp == reverse)
            return true;

        else
            return false;
    }

    public static void main (String args[])
    {
        System.out.println("Please enter a number: ");
        int num = new Scanner(System.in).nextInt();

        if (checkPalindrome(num))
            System.out.println(num + " is a palindrome.");

        else
            System.out.println(num + " is a not palindrome.");
    }
}
