import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.Math;


public class Linecomp{

  public static void main(String[] args){
      System.out.println("Welcome to Line Comparison Computation Program");

      Scanner a = new Scanner(System.in);
      System.out.println("Enter x1 value");
      int x1 = a.nextInt();


      Scanner b = new Scanner(System.in);
      System.out.println("Enter y1 value");
      int y1 = b.nextInt();

      Scanner c = new Scanner(System.in);
      System.out.println("Enter x2 value");
      int x2 = c.nextInt();

      Scanner d = new Scanner(System.in);
      System.out.println("Enter y2 value");
      int y2 = d.nextInt();

      double len = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
      System.out.println("Length of line : " + len);

      Scanner e = new Scanner(System.in);
      System.out.println("Enter x3 value");
      int x3 = e.nextInt();


      Scanner f = new Scanner(System.in);
      System.out.println("Enter y3 value");
      int y3 = f.nextInt();

      Scanner g = new Scanner(System.in);
      System.out.println("Enter x4 value");
      int x4 = g.nextInt();

      Scanner h = new Scanner(System.in);
      System.out.println("Enter y4 value");
      int y4 = h.nextInt();

      double len1 = Math.sqrt((Math.pow((x4-x3),2))+(Math.pow((y4-y3),2)));
      System.out.println("Length of line : " + len1);

      if( len == len1 ){
			System.out.println("Both the lines are equal");
		}else{
			System.out.println("Both the lines are not equal");
		}
       Double l1 = new Double(len);
		 Double l2 = new Double(len1);


       System.out.println(l1.compareTo(l2));
   }
}
