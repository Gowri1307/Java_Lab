import java.util.*;

class Student {
    String usn, name;
    int subs;
    int[] credits, marks;
    float sgpa;
    
    Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the details of the first student:");
        System.out.println("---------------------------------------\n");
        System.out.print("Enter USN:  ");
        usn = in.next();
        System.out.print("Enter Name:  ");
        name = in.next();
        System.out.print("Enter number of subjects:  ");
        subs = in.nextInt();
        
        marks = new int[subs];
        credits = new int[subs];
        
        System.out.println("\nEnter Marks of each subject:");
        System.out.println("----------------------------\n");
        
        for (int i = 0; i < subs; ++i)
        {
            System.out.print("Marks of "+(i+1)+" subject:  ");
            marks[i] = in.nextInt();
        }  
        System.out.println("\nEnter Credits of each subject:");
        System.out.println("------------------------------\n");
        
        for (int i = 0; i < subs; ++i) 
        {
            System.out.print("Credits of "+(i+1)+" subject:  ");
            credits[i] = in.nextInt();
        }        
    }
    Student(String usn, String name, int subs) {
        Scanner in = new Scanner(System.in);
        
        this.usn = usn;
        this.name = name;
        this.subs = subs;
        marks = new int[subs];
        credits = new int[subs];
        System.out.println("\n\nSecond Student:");
        System.out.println("---------------");
        System.out.println("\nUSN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Number of Subjects: " + subs);
        
        System.out.println("\nEnter Marks of each subject:");
        System.out.println("----------------------------\n");
        
        for (int i = 0; i < subs; ++i)
        {
            System.out.print("Marks of "+(i+1)+" subject: ");
            marks[i] = in.nextInt();
        } 
 
        System.out.println("\nEnter Credits of each subject:");
        System.out.println("------------------------------\n");
        
        for (int i = 0; i < subs; ++i) 
        {
            System.out.print("Credits of "+(i+1)+" subject: ");
            credits[i] = in.nextInt();
        }             
    }
    
    void calcGpa() {
        float sop = 0, totalcred = 0;
        int grade;
        
        for (int i = 0; i < subs; ++i)
        {
            if (marks[i] >= 90) 
               grade = 10;
            else if (marks[i] >= 75 && marks[i] < 90)
               grade = 9;
            else if (marks[i] >= 60 && marks[i] < 75)
               grade = 8;
            else if (marks[i] >= 50 && marks[i] < 60)
               grade = 7;
            else if (marks[i] >= 40 && marks[i] < 50) 
               grade = 6;
            else 
               grade = 0;
        
            sop += grade * credits[i];
            totalcred += credits[i]; 
        }
        
        sgpa = sop / totalcred;
    }
    
    void printDetails() {
    System.out.println("\nUSN: " + usn);
    System.out.println("Name: " + name);
    System.out.println("Number of Subjects: " + subs);
    System.out.print("Marks: ");
    
    for (int i = 0; i < subs; ++i) {
            System.out.print(marks[i]+"    ");
        }
        
    System.out.println("\nSGPA: " + sgpa);
    } 
}

class studentmain {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.calcGpa();
        
        Student s2 = new Student("1BM18CS133", "Gowri", 5);
        s2.calcGpa();
        System.out.println("\n\nFirst Student Details:");
        System.out.println("----------------------");
        s1.printDetails();
        System.out.println("\nSecond Student Details:");
        System.out.println("-------------------------");
        s2.printDetails();
    }
}

                
