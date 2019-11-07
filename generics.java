import java.util.*;

class multigen<T1,T2>
{
   T1 a;
   T2 b;
   multigen(T1 a1,T2 b2)
   {
      a=a1;
      b=b2;
   }
   T1 rettype1()
   {
      return a;
   }
   T2 rettype2()
   {
      return b;
   }
   void display()
   {
      System.out.println("A= "+a+"  B= "+b);
   }
}

class mgendemo
{
   public static void main(String args[])
   {
      multigen<Integer,Character> m1=new multigen <Integer, Character>(10,'+');
      multigen<String,Boolean> m2=new multigen <String, Boolean>("Hi",true);
      int c=m1.rettype1();
      char x=m1.rettype2();
      System.out.println("C= "+c+"  X= "+x);
      String c1=m2.rettype1();
      Boolean x1=m2.rettype2();
      System.out.println("C1= "+c1+" X1= "+x1);
      m1.display();
      m2.display();
   }
}

      
   
