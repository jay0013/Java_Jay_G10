/*
import java.util.Scanner;
class ElevenMarch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year:");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 !=0)
		{
			System.out.println(year+"This is Leap Year");
		}
		else
		{
			System.out.println(year+"This is not Leap Year");
		}
	}
}

import java.util.Scanner;
class ElevenMarch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value of A:");
		int a = sc.nextInt();
		System.out.println("Enter The value of B:");
		int b = sc.nextInt();
		System.out.println("Enter The value of C:");
		int c = sc.nextInt();
		int sum = a+b+c;
		if(sum == 180 && a>0 && b>0 && c>0)
		{
			System.out.println("This is Valid Tringle");
		}
		else
		{
			System.out.println("This is Not Valid Tringle");
		}
	}
}


import java.util.Scanner;
class ElevenMarch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		switch(d)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid Day");
		}
	}
}



import java.util.Scanner;

class ElevenMarch 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        double[] number = new double[5];
        System.out.println("Enter The Number");
        for (int i = 0; i < 5; i++) 
		{
            System.out.println("Enter Number " + (i + 1) + ": ");
            number[i] = sc.nextDouble(); // Change to nextDouble()
        }
        System.out.println("Select Option");
        System.out.println("1.Find Smallest Number");
        System.out.println("2.Find Largest Number");
        System.out.println("3.Sum");
        System.out.println("4.Average");
        int choice = sc.nextInt();
        double min = number[0]; // Initialize min with the first number
        double max = number[0]; // Initialize max with the first number
        double sum = 0;
        switch (choice) 
		{
            case 1:
                for (double num : number) 
				{
                    if (num < min) 
					{
                        min = num;
                    }
                }
                System.out.println("This is Smallest Number " + min);
                break;
            case 2:
                for (double num : number) 
				{
                    if (num > max) 
					{
                        max = num;
                    }
                }
                System.out.println("This is Largest Number " + max);
                break;
            case 3:
                for (double num : number)
				{
                    sum += num;
                }
                System.out.println("This is Sum of  Number " + sum);
                break;
            case 4:
                for (double num : number) 
				{
                    sum += num;
                }
                double average = sum / 5;
                System.out.println("This is Average of  Number " + average);
                break;
            default:
                System.out.println("Invalid Choice Choose Between 1 to 4");
        }
    }
}

*/

