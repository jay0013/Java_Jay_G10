/*import java.util.Scanner;

class Cube 
{
    float height;
    float width;
    float depth;

    float calArea(float h, float w, float d) 
	{
        height = h;
        width = w;
        depth = d;
        return height * width * depth;
    }
}

public class Fifteen 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        Cube c1 = new Cube();
        Cube c2 = new Cube();

        System.out.print("Enter height, width, and depth of cube 1: ");
        float h1 = scanner.nextFloat();
        float w1 = scanner.nextFloat();
        float d1 = scanner.nextFloat();

        System.out.print("Enter height, width, and depth of cube 2: ");
        float h2 = scanner.nextFloat();
        float w2 = scanner.nextFloat();
        float d2 = scanner.nextFloat();

        System.out.println("c1 area = " + c1.calArea(h1, w1, d1));
        System.out.println("c2 area = " + c2.calArea(h2, w2, d2));

        scanner.close();
    }
}

class Fifteen
{
	public static void main(String[] args)
	{
		Fifteen c = new Fifteen();
	}
}

class Student
{
	String name;
	int roll_no;
	Student(String s_name, int s_roll)
	{
		System.out.println("ConstroctorInvoked");
		this.name=s_name;
		this.roll_no=s_roll;
	}
	Student(Student s)
	{
		System.out.println("CopyConstroctor");
		this.name=s.name;
		this.roll_no=s.rolno;
	}
	public void display()
	{
		System.out.println("Name"+name);
		System.out.println("Roll_no"+roll_no);
	}
}
class Fifteen
{
	public static void main(String[] args)
	{
		float area;
		Student s1=new Student("Abc",101);
		Student s2=new Student(s1);
		s1.display();
		s2.display();
	}
}
*/
class Student 
{
    String name;
    int roll_no;

    Student(String s_name, int s_roll) 
	{
        System.out.println("Constructor Invoked");
        this.name = s_name;
        this.roll_no = s_roll;
    }

    Student(Student s) 
	{
        System.out.println("Copy Constructor Invoked");
        this.name = s.name;
        this.roll_no = s.roll_no;
    }

    public void display() 
	{
        System.out.println("Name: " + name);
        System.out.println("Roll_no: " + roll_no);
    }
}

class Fifteen 
{
    public static void main(String[] args) 
	{
        Student s1 = new Student("Abc", 101);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}

