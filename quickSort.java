import java.util.Scanner;
import java.util.Arrays;

class QuickSort 
{
  private void swap(int i, int j)
  {
    int temp = b[i];
    b[i] = b[j];
    b[j] = temp;
  }

  public void sort(int[] a)
  {
    if (a == null || a.length == 0)
      return;
    this.b = a;
    length = a.length;
    quickSort(0, length - 1);
  }

  private void qSort(int bottom, int top)
  {
    int i = bottom;
    int j = top;

    int p = b[bottom + (top - bottom) / 2];

    if (bottom < j)
      qSort(bottom, j);
    
    if (i < top)
      qSort(i, top);

    while (i < j)
    {
      while (b[i] < p)
        i++;
      
      while (b[j] > p)
        j--;
      
      if (i <= j)
      {
        swap(i, j);
        i++;
        j--;
      }
    }
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

    System.out.println("Unsorted array: " + a);
  }
}