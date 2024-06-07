
/*

Z:\Java>java Sixteen
Inside static block: Initialized staticVariable = 10
Inside initializer block: Initialized instance variable = 20
Inside constructor
Static Variable: 10
Instance Variable: 20

*/


class Myclass 
{
    static int staticVariable;
    int instanceVariable;

    // Static block
    static 
	 {
        staticVariable = 10;
        System.out.println("Inside static block: Initialized staticVariable = " + staticVariable);
    }

    // Initializer block
    {
        instanceVariable = 20;
        System.out.println("Inside initializer block: Initialized instance variable = " + instanceVariable);
    }

    // Constructor
    Myclass() 
	{
        System.out.println("Inside constructor");
    }

    // Method
    void display() 
	{
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }
}

class Sixteen 
{
    public static void main(String[] args) 
	{
        Myclass myObject = new Myclass(); // Create an object of MyClass
        myObject.display(); // Call the display() method of myObject
    }
}