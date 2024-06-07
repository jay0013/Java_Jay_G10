/*
public class Car {
    private String nameOfModel;
    private int yearOfModel;

    // Default constructor
    public Car() {
        this.nameOfModel = "No Name";
        this.yearOfModel = 0;
    }

    // Overloaded constructor
    public Car(String name, int year) 
	{
        this.nameOfModel = name;
        this.yearOfModel = year;
    }

    // Copy constructor
    public Car(Car car) 
	{
     
        this.nameOfModel = car.getNameOfModel();
        this.yearOfModel = car.getYearOfModel();
    }

    // Getter methods
    public String getNameOfModel() 
	{
        return this.nameOfModel;
    }

    public int getYearOfModel() 
	{
        return this.yearOfModel;
    }

    // Display method
    public void display() {
        System.out.println("Name of Model: " + this.nameOfModel);
        System.out.println("Year of Model: " + this.yearOfModel);
    }

    // Main method for testing
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2005);
        Car car2 = new Car(car1);

        car1.display();
        car2.display();
    }
}



class Car {
    static int a = 4; //static variable declared & initialized
    static int b; //static variable declared

    static void dispValue(int x) {
        System.out.println("Static method initialized.");
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    } //static method

    static {
        System.out.println("Static block initialized.");
        b = a * 5;
    } //static block

    public static void main(String args[]) {
        System.out.println("inside main()...");
        dispValue(44);
    } //main()
} //class Example : Static Block , Method and Variable

*/