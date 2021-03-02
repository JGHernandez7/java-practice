import java.util.Arrays;

public class QuickSort
{
  public static void main(String args[])
  {
    int[] a = {1, 9, 5, 2, 7, 4, 8, 5};
    System.out.println("Unsorted: " + Arrays.toString(a));

    QS algorithm = new QS();

    algorithm.sort(a);

    System.out.println("Sorted: " + Arrays.toString(a));
  }
}

class QS
{
  private int input[];
  private int len;

  public void sort(int[] n) 
  { 
    if (n == null || n.length == 0) 
      return; 

      this.input = n; 
      len = n.length; 
      quickSort(0, len - 1); 
  } 

  private void quickSort(int l, int h) 
  { 
    int i = l; 
    int j = h;  
    int p = input[l + (h - l) / 2];
    
    while (i <= j)
    {
      while (input[i] < p) 
        i++; 
 
      while (input[j] > p) 
        j--; 

      if (i <= j)
      {
        swap(i, j);  
        i++; 
        j--;
      } 
    }

    if (l < j) 
      quickSort(l, j); 

    if (i < h) 
      quickSort(i, h);
  }

  private void swap(int i, int j) 
  { 
    int temp = input[i]; 
    input[i] = input[j]; 
    input[j] = temp; 
  }
}
