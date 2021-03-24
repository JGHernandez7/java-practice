public class LCS
{
  int lcs( char[] x, char[] y, int m, int n )
  {
    if (m == 0 || n == 0)
      return 0;

    if (y[m - 1] == y[n - 1])
      return 1 + lcs(x, y, m - 1, n - 1);
    
    else
      return max(lcs(x, y, m, n - 1), lcs(x, y, m - 1, n));
  }

  int max(int a, int b)
  {
    if (a > b)
      return a;
    
    else
      return b;
  }

  public static void main(String[] args)
  {
    LCS test = new LCS();
    
    String s1 = "ZJJUZW";
    String s2 = "JXUXZYW";

    char[] x = s1.toCharArray();
    char[] y = s2.toCharArray();
    
    int m = x.length;
    int n = y.length;

    System.out.println("LCS: " + test.lcs(x, y, m, n));
  }
}
