import java.util.Scanner;
/*
public class Practice 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the maximum number
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find the second maximum number
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element in the array.");
        } else {
            System.out.println("The second maximum number in the array is: " + secondMax);
        }

        scanner.close();
    }
}

class A 
{
     int RollNO;
     String Name;
 
     void InfoInput() 
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Value");
         Name = sc.nextLine();
         RollNO = sc.nextInt();
     }
 }
 
 class B extends A 
 {
     void Info() {
         System.out.println("Name : " + Name + "\nRoll No.:" + RollNO);
     }
 
     void Info(String y, int x) { // Corrected the order of parameters
         System.out.println("Name : " + y + "\nClass Roll No.:" + x);
     }
 }
 
 public class Practice 
 {
     public static void main(String[] args) 
     {
         B OB = new B();
         OB.InfoInput();
         OB.Info();
         
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter RollNO And Name:");
         String Name = sc.nextLine();
         int RNO = sc.nextInt(); // Added a semicolon here
         sc.nextLine(); // Consume the newline character
         OB.Info(Name , RNO); // Changed the order of arguments
     }
 }
 



abstract class Joy
{

    abstract void sound();
}

class Dog extends  Joy
{
void sound()
{
    System.out.print("Dog is Barking");
}
}
class  Cat extends Joy
{
void sound()
{
    {
    System.out.print("Cat is Mewing");
    }
}
}

/**
 * Practice

public class Practice {

    public static void main(String[] args) 
    {
        Dog d=new Dog();
        Cat c=new Cat();
        d.sound();
        c.sound();    
    }
}
 
*/


abstract class Operation
{
    abstract void  POperation(int a, int b);
}
class Addition extends Operation
{
    void  POperation(int a, int b)
    {
        System.out.println("Addition of two numbers : " + (a+b));
    }
}
class  Subtraction extends Operation
{
    void POperation(int a, int b)
    {
        System.out.println("Substraction of two numbers : "+ (a-b));
    }
}

class  Multiplication extends Operation
{
    void POperation(int a, int b)
    {
        System.out.println("Substraction of two numbers : "+ (a*b));
    }
}

class  Division extends Operation
{
    void POperation(int a, int b)
    {
        if  (b != 0)
        {
            System.out.println("Division of two numbers is :" + (a/b) );
        }
        else
        {
            System.out.println("Error! Dividing by zero");
        }
    }
}
public class Practice
{
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char Operator;
        int choice;

        // Menu
        System.out.println("Menu:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice: ");
       choice = sc.nextInt();
       // Input from user for first number
       System.out.print("Enter First Number: ");
       a=sc.nextInt();
       // Input from user for second number
       System.out.print("Enter Second Number: ");
       b=sc.nextInt();

       Operation r=null;
       switch(choice)
       {
        case 1:
        r=new Addition();
        Operator = '+';
        break;
        case 2:
        r=new Subtraction();
        Operator = '-';
        break;
        case 3:
        r=new Multiplication();
        Operator = '*';
        break;
        default:
        System.out.println("Invalid Choice!");
        return;
       }
       if (r!=null)
       {
        r.POperation(a,b);
       }
    }
}