import java.util.Scanner;
/*class TakeInput
{
    int a,b,c;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Two Number:");
        a = sc.nextInt();

        b = sc.nextInt();
    }
}

class Calculate extends TakeInput
{
    void Add()
    {
        c=a+b;
        System.out.println("Addition Of Two Number:"+c);
    }
    void Sub()
    {
        c=a-b;
        System.out.println("Substraction Of Two Number:"+c);
    }
    void Mul()
    {
        c=a*b;
        System.out.println("Multiplication Of Two Number:"+c);
    }
    void Div()
    {
        if (b != 0) 
        {
            c = a / b;
            System.out.println("Division Of Two Numbers: " + c);
        } 
        else 
        {
            System.out.println("Cannot divide by zero.");
        }

    }
}

class Test extends Calculate
{
            public static void main(String[] args) 
            {
                Test r=new Test();
                r.input();
                r.Add();
                r.Sub();
                r.Mul();
                r.Div();
            }

}



class A
{
    String name;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Name:");
        name = sc.nextLine();
    }
}

class B extends A
{
    void show()
    {
        System.out.println(name);
    }
}

class C extends A
{
    void Display()
    {
        System.out.println(name);
    }
}

class Test
{
    public static void main(String []args)
    {
        C r=new C();
        B t=new B();
        t.input();
        r.input();
        t.show();
        r.Display();
    }
}

class A
{
    int a,b,c;
    void input()
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two values:");
        a = sc.nextInt();
        b = sc.nextInt();
        
    }
}
class B extends A
{
    void add()
    {
    c = a+b;
    System.out.println(c);
    }
    void Add(int x,int y)
    {
    c = a+b;
    System.out.println(c);
    }
    void Add(int p,double q)
    {
    double sum = a+b;
    System.out.println(sum);
    }

}
class Test extends B
{
    public static void main(String[] args)
    {
        Test r=new Test();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two values:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter two values:");
        int p = sc.nextInt();
        double q = sc.nextInt();


        r.input();
        r.add();
        r.add(x,y);
        r.add(p,q);
    }
}

import java.util.Scanner;

class A {
    int a, b, c;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values:");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}

class B extends A {
    void add() {
        c = a + b;
        System.out.println(c);
    }

    void add(int x, int y) {
        c = x + y;
        System.out.println(c);
    }

    void add(int p, double q) {
        double sum = p + q;
        System.out.println(sum);
    }
}
class Test extends B
{
    public static void main(String[] args) 
    {
        Test r=new Test();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer values:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter an integer and a double value:");
        int p = sc.nextInt();
        double q = sc.nextDouble();

        r.input();
        r.add();
        r.add(x, y);
        r.add(p, q);
    }
}

class A 
{
    int a,b,c;
    A()
    {
       a=10;
       b=20;
       c=a+b;
       System.out.println(c);
    }

}

class Test
{
    public static void main(String []args)
    {
        A r=new A();
    }
}



import java.util.Scanner;

class Denny {
    String Name;
    int Bod;

    Denny(String x, int y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter Bod:");
        Bod = sc.nextInt();
    }

    void show() {
        System.out.println(Name + " " + Bod);
    }
}

public class Test {
    public static void main(String[] args) {
        Denny r = new Denny("", 0); // Create an instance of Denny, providing placeholders for parameters
        r.show(); // Show the details entered by the user
    }
}




import java.util.Scanner;

class MyClass {
    int number;

    // Constructor
    MyClass(int num) 
    {
        this.number = num;
    }

    // Method to display the number
    void show() 
    {
        System.out.println("Number: " + number);
    }
}

public class Test {
    public static void main(String[] args) 
    {
        // Static initialization example
        MyClass r= new MyClass(10); // Creating an instance using static initialization
        r.show(); // Display the number

        // User input example
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = sc.nextInt(); // Read user input

        MyClass t= new MyClass(userInput); // Creating an instance using user input
        t.show(); // Display the number
    }
}

abstract class Subjects
{
     public abstract void classroom();
}
class Maths extends Subjects
{
    public void  classroom()
    {
       System.out.println("Topic is Matrix");
    }
}
class Java extends Subjects
{
    public void classroom()
    {
        System.out.println("Topic is Abstract");
    }
}
class Test
{
    public static void main (String[] args)
    {
        Maths r=new Maths();
        Java t=new Java();
        r.classroom();
        t.classroom();

    }
}
*/
import java.util.Scanner;

abstract class BankAccount
{
    int balance;

    public BankAccount() 
    {
        balance = 0;
    }

    void Deposit(int amount) 
    {
        balance += amount;
        System.out.println(amount + " Deposit Successfully");
    }

    void Withdrawal(int amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } 
        else 
        {
            System.out.println("Insufficient balance");
        }
    }

    public abstract void balanceInquiry();
}

class CheckingAccount extends BankAccount 
{
    public CheckingAccount() 
    {
        super();
    }

    public void balanceInquiry() 
    {
        System.out.println("Checking balance account " + balance);
    }
}

class Test {
    public static void main(String[] args) 
    {
        int deposit;
        int withdrawal;
        Scanner sc = new Scanner(System.in);
        CheckingAccount r = new CheckingAccount();

        System.out.println("Enter amount to Deposit");
        deposit = sc.nextInt();
        r.Deposit(deposit);

        System.out.println("Enter amount to Withdraw");
        withdrawal = sc.nextInt();
        r.Withdrawal(withdrawal);

        r.balanceInquiry();
    }
}




 