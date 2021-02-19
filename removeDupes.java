import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

class RemoveDupes 
{
  public static void main(String[] args) 
  {
    List<Integer> numbers = new ArrayList<Integer>();

    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(2);
    numbers.add(3);

    System.out.println("List of numbers: " + numbers);

    Set<Integer> numbersNoDupes = new LinkedHashSet<Integer>(numbers);

    numbers.clear();
    numbers.addAll(numbersNoDupes);

    System.out.println("List of numbers with no dupes: " + numbers);
  }
}