import java.io.*;

class SwapVarTwo
{ 
    public static void main(String a[])
    {
        int x = 10;
        int y = 5;
        System.out.println("Before: x = " + x + " y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After: x = " + x + " y = " + y);
    }
}