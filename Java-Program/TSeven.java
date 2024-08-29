import java.util.Scanner;

/*
class TSeven
{
 public static void main(String args[])
{
	 try
	 {
		int a = 30, b = 0;
		int c = a/b;
		System.out.println("Result = " + c);
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Cant Divide a number by 0");
	 }
 }
}



class TSeven
{
	 public static void main(String args[])
  {
	 try
	 {
		int num = Integer.parseInt("akki");
		System.out.println(num);
	 }
	 catch(NumberFormatException e)
	 {
		 System.out.println("Number Format Exception");
		 System.out.println(e);
	 }
  }
}


class TSeven
{
	 public static void main(String args[])
  {
	 try
	 {
		String a = null;
		System.out.println(a.charAt(0));
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("NullPointerException");
	 }
  }
}

class TSeven
{
	 public static void main(String args[])
  {
	 try
	 {
		int a[] = null;
		System.out.println(a.charAt(0));
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("NullPointerException");
	 }
  }
}


// Define the user-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int userInput = scanner.nextInt();

    // Check if the user input is negative
    if (userInput < 0) {
        // Throw the user-defined exception
        throw new NegativeNumberException("Negative numbers are not allowed.");
    }

    // The rest of your code goes here
}

*/




class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class TSeven {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int userInput = scanner.nextInt();

        // Check if the user input is negative
        if (userInput < 0) {
            // Throw the user-defined exception
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }

        // The rest of your code goes here
        System.out.println("You entered a positive number: " + userInput);
    }
}