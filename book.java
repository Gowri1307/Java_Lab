import java.util.*;
class book
{
    String name,author;
    double price;
    int num_pages;
    book()
    {
        name=null;
        author=null;
        price=0.0;
        num_pages=0;
    }
    void setdata()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.print("\nEnter the name of the book: ");
        name=s.next();
        System.out.print("Enter the name of the author: ");
        author=s.next();
        System.out.print("Enter the price of the book: ");
        price=s.nextDouble();
        System.out.print("Enter the number of pages of the book: ");
        num_pages=s.nextInt();
    }
    public String toString()
    {
        String b=("Name: "+name+"\nAuthor Name: "+author+"\nPrice: "+price+"\nNumber of Pages: "+num_pages);
        return b;
    }
    void getdata()
    {
        String str=toString();
        System.out.println(str);
    }
}

class bookmain
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n=s.nextInt();
        book b1[]=new book[n];
        for(int i=0;i<n;i++)
        {
            b1[i]=new book();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter the details of the "+(i+1));
            if((i+1)==1)
                System.out.println("st book: ");
            else if((i+1)==2)
                System.out.println("nd book: ");
            else if((i+1)==3)
                System.out.println("rd book: ");
            else 
                System.out.println("th book: ");
            b1[i].setdata();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("\n\nBook "+(i+1)+" details:");
            System.out.println("---------------");
            b1[i].getdata();
        }

    }
}
        
        

