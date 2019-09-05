import java.util.Scanner;
class time
{
    int hr,min,sec;
    time()
    {
       hr=0;
       min=0;
       sec=0;
    }
    time(int h, int m,int s)
    {
       hr=h;
       min=m;
       sec=s;
    }
    void acceptin()
    {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the hours: ");
       hr=s.nextInt();
       System.out.print("Enter the minutes: ");
       min=s.nextInt();
       System.out.print("Enter the seconds: ");
       sec=s.nextInt();
    }
    time add(time t)
    {
       time temp=new time();
       temp.hr=hr+t.hr;
       temp.sec=sec+t.sec;
       if(temp.sec>=60)
       {
           (temp.min)++;
           temp.sec=temp.sec-60;
       }
       temp.min+=(min+t.min);
       if(temp.min>=60)
       {
           (temp.hr)++;
           temp.min=temp.min-60;
       }
       return temp;
    }
    void display()
    {
        System.out.println("\nTime is: "+hr+":"+min+":"+sec);
    }
}

class timemain{
    public static void main(String args[]){
        time t1=new time(10,35,23);
        time t2=new time();
        time t3=new time();
        t2.acceptin();
        t3=t1.add(t2);
        System.out.println("\nT1 Details:");
        System.out.println("-----------");
        t1.display();
        System.out.println("\nT2 Details:");
        System.out.println("-----------");
        t2.display();
        System.out.println("\nT3 Details:");
        System.out.println("-----------");
        t3.display();
    }
}


