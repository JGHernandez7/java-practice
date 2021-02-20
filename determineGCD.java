import java.util.Scanner;

class DetermineGCD 
{
  private static int findGCD(int a, int b)
  {
    if(a == 0)
      return b;
    
    if (b == 0)
      return a;
    
    return findGCD(b, a%b);
  }

  public static void main(String[] args) 
  {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = s.nextInt();
    
    System.out.println("Enter another number: ");
    int b = s.nextInt();

    System.out.println("GCD of " + a + " and " + b + ": " + findGCD(a, b));
  }
}