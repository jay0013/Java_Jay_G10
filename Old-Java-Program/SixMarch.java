/*    int i=1;
	i=2+2*i++;
	2+2=4
	
	int a=2,b=7,c=10
	c=a==b;
	c=0;
	
	int a=2,b=7,c=10;
	c=a!=b;
	
	int a=100+200/10-3*10
	
	int a=2,b=6,c=12,d;
	d=a*b+c/b;
	printf("The value of d=%d",d);
	
	
class SixMarch
{
	public static void main(String args[])
	{
		
		SixMarch fun = new SixMarch();
		fun.cal();
		fun.cal2();
		fun.cal3();
		fun.cal4();
	}
	public void cal()
	{
		int i=1;
		i=2+2*i++;
		System.out.println(i);
	}
	public void cal2()
	{
		int a=2,b=7,c=10;
		boolean r = a!=b;
		System.out.println(r);
	}
	public void cal3()
	{
		int a=2,b=7,c=10;
		boolean r = a==b;
		System.out.println(r);
	}
	public void cal4()
	{
		int a=2,b=6,c=12,d;
		d=a*b+c/b;
		System.out.println(d);
	}
}



import java.util.Scanner;
class SixMarch
{
	public static void main(String args[])
	{
		//Syntax Of Array
		//Datatype nameofarray = new datatype[Size];
		int no[]= new int[3];
		Scanner sc = new Scanner(System.in);
		no[0]=11;
		no[1]=111;
		no[2]=100;
		for (int i=0;i<no.length;i++)
		{
			System.out.println("Enter the Value");
			no[i]=sc.nextInt();
		}
		//System.out.println(no[0]);
		//System.out.println(no[1]);
		//for (int i=0;i<3;i++)
		for (int i=0;i<no.length;i++)
		{
		System.out.println(no[i]);
		}
	}
}



import java.util.Scanner;
class SixMarch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum =0;
		double average;
		System.out.println("Enter The 10 Number:");
		for (int i=0;i<10;i++)
		{
			int num =sc.nextInt();
			sum += num;
		}
		average = (double) sum / 10;
		System.out.println(sum);
		System.out.println(average);
	}
}



import java.util.Scanner;
class SixMarch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sumOdd = 0;
		int sumEven = 0;
		System.out.println("Enter The 10 Number:");
		for (int i=0;i<10;i++)
		{
		 int num =sc.nextInt();
		 if (num % 2 == 0)
		 {
			 sumEven += num;
		 }
		 else
		 {
			 sumOdd += num;
		 }
		}
		System.out.println("Sum of Odd Number"+sumOdd);
		System.out.println("Sum of Even Number"+sumEven);
	}
}



import java.util.Scanner;
class SixMarch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] Oddnumber = new int[10];
		int[] Evennumber = new int[10];
		System.out.println("Enter The 10 Number:");
		for (int i=0;i<10;i++)
		{
		 int num =sc.nextInt();
		 if (num % 2 == 0)
		 {
			 Oddnumber[i]= num;
		 }
		 else
		 {
			 Evennumber[i]= num;
		 }
		}
		System.out.println("Odd/Even");
		for (int i=0;i<10;i++)
		{
			System.out.println(Oddnumber[i]+"\t" + Evennumber[i]);
		}
		int sumOdd = calSum(Oddnumber);
		int sumEven = calSum(Evennumber);
		System.out.println("-------------------");
		System.out.println("Sum = " + sumOdd + "\t" + sumEven);
	}
	public static int calSum(int[] num)
	{
		int sum = 0;
		for(int sum : num)
		{
			sum += num;
		}
		return sum;
	}
}
*/