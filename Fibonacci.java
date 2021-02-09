import java.util.Scanner;

//Fibonacci sequence using memoization.

public class Fibonacci
{
    private static int[] fiboCache = new int[100];

    private static int fibo(int i)
    {
        int result;

        if(i == 0)
            return 0;

        else if (i == 1)
            return 1;

        else if (fiboCache[i] != 0)
            return fiboCache[i];

        else
        {
            result = fibo(i- 1) + fibo(i - 2);
            fiboCache[i] = result;
            return result;
        }
    }

    public static void main(String args[])
    {
        System.out.println("Please enter the Fibonacci index:");
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        s.close();

        System.out.println("Result: " + fibo(i));
    }
}
