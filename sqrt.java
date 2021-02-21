import java.util.Scanner;

class Sqrt 
{
  private static float findSqrt(int n)
  {
    float temp, root = n/2;
    do
    {
      temp = root;
      root = (temp + (n/temp))/2;
    } while ((temp-root)!= 0);
    return root;
  }

  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter your number: ");
    int n = s.nextInt();

    System.out.println("Square root of " + n + " is: " + findSqrt(n));
  }
}