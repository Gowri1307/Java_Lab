import java.util.*;

class WrongAgeException extends Exception
{
   String ex;
   String ey;
   WrongAgeException(String x,String y)
   {
      ex=x;
      ey=y;
   }
   public String toString()
   {
      return("\n"+ex+" age should not be "+ey);
   }
}

class father
{ 
  public int fage;
  father() throws WrongAgeException
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age of the father:");
    fage=sc.nextInt();
    if(fage<0)
      {
         throw new WrongAgeException("Father's","less than zero");
      } 
  }
}

class son extends father
{ 
  int sage;
  son() throws WrongAgeException
  {  
        super();
        System.out.println("\nEnter the age of the son:");
        Scanner sc=new Scanner(System.in);
        sage=sc.nextInt();
     
        if(sage<0)
        {
            throw new WrongAgeException("Son's","less than zero");
        }
        else if(sage>0)
        {
            if(sage>=fage)
            {
                 throw new WrongAgeException("Father's","less than or equal to the son's age"); 
            }
            else
            {
                 System.out.println("\nSon's age: "+sage+"\nFather's age: "+fage);
            }
        }
     
  }
}  


class Main
{
   public static void main(String args[])
   {
     try{
      son s=new son(); 
	}
      
     catch(WrongAgeException wae)
     {
        System.out.println(wae);
     }  
}
}  
       
