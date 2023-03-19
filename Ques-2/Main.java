import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        Manager m1=new Manager();
        System.out.println("Enter Details for Manager.");
        System.out.print("Name:");
        m1.name=sc.nextLine();
        System.out.print("Age:");
        m1.age=sc.nextInt();
        System.out.print("Phone Number:");
        m1.phno=sc.nextInt();
        sc.nextLine();
        System.out.print("Address:");
        m1.address=sc.nextLine();
        System.out.print("Salary:");
        m1.salary=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Details for Employee.");
        System.out.print("Name:");
        e1.name=sc.nextLine();
        System.out.print("Age:");
        e1.age=sc.nextInt();
        System.out.print("Phone Number:");
        e1.phno=sc.nextInt();
        sc.nextLine();
        System.out.print("Address:");
        e1.address=sc.nextLine();
        System.out.print("Salary:");
        e1.salary=sc.nextInt();
        System.out.println();

        System.out.println("Details of Manager:");
        System.out.println("Name:"+m1.name);
        System.out.println("Age:"+m1.age);
        System.out.println("Address"+m1.address);
        System.out.println("Phone Number:"+m1.phno);
        m1.print_Salary();
        System.out.println("Specialization:"+m1.special);
        System.out.println("Department:"+m1.dept);
        System.out.println();

        System.out.println("Details of Employee:");
        System.out.println("Name:"+e1.name);
        System.out.println("Age:"+e1.age);
        System.out.println("Address:"+e1.address);
        System.out.println("Phone Number:"+e1.phno);
        e1.print_Salary();
        System.out.println("Specialization:"+e1.special);
        System.out.println("Department:"+e1.dept);
    }
}