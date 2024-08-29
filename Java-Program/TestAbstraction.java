/*abstract class vehicle
{
	abstract void start();
}
*/
abstract class shape
{
	abstract void draw();
}

class rectangle extends shape
{
	void draw()
	{
		System.out.println("Draeing rectangle");
	}
}

class circle extends shape 
{
	void draw()
	{
		System.out.println("Drawing circle");
	}
}

class TestAbstraction
{
	public static void main(String args[])
	{
		shape s=new circle();
		s.draw();
	}
}