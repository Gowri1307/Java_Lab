import java.util.Scanner;
public class roots 
{
   public static void main(String args[]){
      double r1= 0, r2 = 0;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the value of a : ");
      double a = s.nextDouble();

      System.out.println("Enter the value of b : ");
      double b = s.nextDouble();

      System.out.println("Enter the value of c : ");
      double c = s.nextDouble();

      double d = (b*b)-(4*a*c);
      double sqrt = Math.sqrt(d);

      if(d>0)
      {
         r1 = (-b + sqrt)/(2*a);
         r2 = (-b - sqrt)/(2*a);
        System.out.println("Roots are : "+ r1 +" and "+r2);
      }
     else if(d == 0)
      {
         System.out.println("Root is : "+(-b + sqrt)/(2*a));
      }
      else
     {
           System.out.println("There are no real roots.");
     }
   }
}