import java.io.*;

class FindDupeChar
{
  public static void main(String arg[]) throws Exception
  {
    String result = "";
    
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    
    String a = b.readLine();

    while(a.length() > 0)
    {
      int c = 0;

      for(int i = 0; i < a.length(); i++)
      {
        if(a.charAt(0) == a.charAt(i))
          c = c + 1;
      }

      result = result + a.charAt(0) + ": " + c + "\n";
      
      String t[]= a.split(a.charAt(0) + "");
      
      a = new String("");

      for(int j = 0; j < t.length; j++)
      {
        a = a + t[j];
      }
    }

    System.out.println(result);
  }
}