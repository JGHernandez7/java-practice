import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;

//Program to remove duplicates from array using LinkedHastSet to maintain order.

public class ListOfNumbers
{
    public static void main (String args[])
    {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("List of numbers: " + list);

        Set<Integer> noDupes = new LinkedHashSet<Integer>(list);

        list.clear();
        list.addAll(noDupes);

        System.out.println("List of numbers without duplicates: " + list);
    }
}
