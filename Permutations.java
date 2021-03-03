class Permutations
{
  private static void permutation(String a)
  {
    permutation("", a);
  }

  private static void permutation(String b, String input)
  {
    if (input.isEmpty())
      System.err.println(b + input);
    
    else
    {
      for (int i = 0; i < input.length(); i++)
      {
        permutation(b + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));
      }
    }
  }

  public static void main(String[] args) 
  {
    String a = "ABC";
    System.out.println("String: " + a);

    System.out.println("Permutations: ");
    permutation(a);
  }
}