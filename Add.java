import java.util.Scanner;
public class Add
{
   public static void main(String args[])
   {
      int x, y, z, d;

      System.out.println("Enter two integers to calculate their difference");
      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
      d=  x - y;
      System.out.println("Sum of the integers = " + z);
System.out.println("Difference of the integers = " + d);
   }
}