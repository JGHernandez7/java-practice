import java.util.Arrays;

class BubbleSort 
{
  public static void bSort(int[] n) 
  { 
    System.out.printf("Array: %s %n", Arrays.toString(n));

    for (int i = 0; i < n.length; i++) 
    { 
      for (int j = n.length - 1; j > i; j--) 
      { 
        if (n[j] < n[j - 1]) 
          swap(n, j, j-1);
      } 
    }

    System.out.printf("Sorted array: %s %n", Arrays.toString(n)); 
  }
  
  private static void swap(int[] a, int prev, int next)
  { 
    int temp = a[prev];

    a[prev] = a[next]; 
    a[next] = temp; 
  }

  public static void main(String args[]) 
  { 
    bSort(new int[] { 2, 1, 4, 9, 10, 5}); 
    bSort(new int[] { 0, -1, 3}); 
    bSort(new int[] { -2, -10, -1, -4}); 
  }
}