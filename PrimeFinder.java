import java.util.Scanner;

//Prime number finder.

public class PrimeFinder
{
    private static String checkPrime(int n)
    {
        if (n == 0 || n == 1)
            return "Not prime.";
        else if (n == 2 || n == 3)
            return "Prime.";
        else if ((n *  n - 1) % 24 == 0)
            return "Prime.";
        else
            return "Not prime.";
    }

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = s.nextInt();
        System.out.print(checkPrime(n));
    }
}
