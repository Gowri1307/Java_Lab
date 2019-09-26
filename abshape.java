import java.util.*;
abstract class shape
{
   int a,b;
   abstract void printArea();
   shape()
   {
      a=0;
      b=0;
   }
   shape(int x, int y)
   {
      a=x;
      b=y;
   }
   shape(int r)
   {
      a=r;
   }
}
 
class rectangle extends shape
{
   double area;
   rectangle(int a,int b)
   {
      super(a,b);
   }
   void printArea()
   {
       area=a*b;
       System.out.println("\nArea of rectangle: "+area);
   }
}

class triangle extends shape
{
   double area;
   triangle(int a,int b)
   {
      super(a,b);
   }
   void printArea()
   {
       area=0.5*a*b;
       System.out.println("\nArea of triangle: "+area);
   }
}

class circle extends shape
{
   double area;
   circle(int a)
   {
      super(a);
   }
   void printArea()
   {
       area=3.14*a*a;
       System.out.println("\nArea of circle: "+area);
   }
}

class abshape
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int op,x,y;
       for(int i=0;i<3;i++)
       {
       	   System.out.println("Find area of:\n ");
       	   System.out.println("1.Rectangle");
       	   System.out.println("2.Triangle");
       	   System.out.println("3.Circle");
       	   System.out.print("\nEnter your choice: ");
       	   op=s.nextInt();
           switch(op)
           {
                 case 1: System.out.print("\nEnter length of rectangle: ");
                         x=s.nextInt();
                         System.out.print("Enter breadth of rectangle: ");
       	                 y=s.nextInt();
       	                 rectangle r=new rectangle(x,y);
       	                 r.printArea();
                         break;
                 case 2: System.out.print("\nEnter base of triangle: ");
                         x=s.nextInt();
                         System.out.print("Enter height of triangle: ");
                         y=s.nextInt();
                         triangle t=new triangle(x,y);
                         t.printArea();
                         break;
       	         case 3: System.out.print("\nEnter radius of circle: ");
                         x=s.nextInt();
                         circle c=new circle(x);
                         c.printArea();
                         break;
           }
           System.out.println("\n-------------------------------\n");
        }
           
   }
}

           
       


   
