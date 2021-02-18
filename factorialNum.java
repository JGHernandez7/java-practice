class FactorialNum 
{
  private static int factorial(int number)
  {
    if (number == 0)
      return 1;
    
    else
      return number*factorial(number-1);
  }

  public static void main(String[] args) 
  {
    int n = 7;
    System.out.println("Factorial of " + n + ": " + factorial(n));
  }
}