import java.util.Scanner;

class TriPattern 
{
  private static void drawTri(int number)
  {
    int n = number;
    for (int i = 0; i < n; i ++)
    {
      for (int j = 0; j < n - i; j++)
        System.out.print("");
      
      for (int k = 0; k <= i; k++)
        System.out.print("^");
      
      System.out.println();
    }
  }

  public static void main(String[] args) 
  {
    int number = 7;
    drawTri(number);
  }
}