import java.util.Scanner;

class BSearch 
{
  private static int binarySearch(int[] a, int n)
  {
    int bottom = 0;
    int top = a.length - 1;

    while (top >= bottom)
    {
      int mid = (top + bottom) / 2;
      
      if (a[mid] == n)
        return mid;
      
      else if (a[mid] < n)
        bottom = mid + 1;
      
      else if (a[mid] > n)
        top = mid - 1;
    }
    return -1;
  }

  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    
    int len = s.nextInt();
    int[] a = new int[len];

    System.out.printf("Enter %d integers %n", len);
    for (int i = 0; i < len; i++)
      a[i] = s.nextInt();

    System.out.println("Enter number to locate: ");
    
    int key = s.nextInt();
    int x = binarySearch(a, key);

    if (x == -1)
      System.out.printf("%d is not applicable.");
    
    else
      System.out.printf("%d is at index %d %n", key, x);
      s.close();
  }
}