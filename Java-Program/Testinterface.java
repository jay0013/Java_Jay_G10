/*abstract class vehicle
{
	abstract void start();
}
*/
interface Drawable
{
	abstract void draw();
}

class rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Draeing rectangle");
	}
}

class circle implements Drawable 
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
}

class Testinterface
{
	public static void main(String args[])
	{
		Drawable d=new circle();
		d.draw();
	}
}