import java.util.*;
import java.lang.*;

class Newthread implements Runnable
{
   String name;
   Thread t;
   Newthread(String n)
   {
      name=n;
      t=new Thread(this,name);
      System.out.println(t);
      t.start();
   }
   public void run()
   {
      try
      {
         while(true)
         {
             System.out.println("CSE : ");
             Thread.sleep(2000);
         }
      }
      catch(InterruptedException ie)
      {
         System.out.println();
      }
   }
}

class threaddemo
{
    public static void main(String args[])
    {
       Newthread m1=new Newthread("Multi-Threads");
       try
       {
             while(true)
             {
                System.out.println("BMS College of Engineering : ");
                Thread.sleep(10000);
             }
       }
       catch(InterruptedException ie)
       {
             System.out.println();
       }
    }
}
             



