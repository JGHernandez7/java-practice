import java.util.Scanner;

//Check if input is a palindrome.

public class Palindrome
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String sample = s.nextLine();

        System.out.printf("%s is a palindrome: %b %n", sample, palindromeCheck(sample));
    }

    private static boolean palindromeCheck(String sample)
    {
        char[] a = sample.toCharArray();
        StringBuilder input = new StringBuilder(sample.length());

        if (sample == null || sample.isEmpty())
            return true;

        for (int i = sample.length() - 1; i >= 0; i --)
            input.append(a[i]);

        String reverse = input.toString();

        return sample.equals(reverse);
    }
}
