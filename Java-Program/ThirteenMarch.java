/*
import java.util.*;
public class ThirteenMarch
{
	public static void main(String[] args)
	{
		int num,pow,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		num=sc.nextInt();
		System.out.println("Enter pow");
		pow=sc.nextInt();
		ThirteenMarch thm=new ThirteenMarch();
		res = thm.power(num,pow);
		System.out.println("Ans:"+res);
	}
	int power(int a, int b)
	{
		int i, r=1;
		for(i=1;i<=b;i++)
		{
			r=r*a;
		} 			
		return r;
	}
}
*/


class Addition
{
	int i,j,k;
	void add(int a)
	{
		i=a;
		System.out.println("Add i:"+i);
	}
	void add(int a,int b)
	{
		i=a;
		j=b;
		System.out.println("Add i+j:"+(i+j));
	}
	void add(int a,int b,int c)
	{
		i=a;
		j=b;
		k=c;
		System.out.println("Add i+j+k:"+(i+j+k));
	}
}
class ThirteenMarch
{
	public static void main(String[] args)
	{
		Addition a1=new Addition();
		a1.add(20);
		a1.add(20,50);
		a1.add(20,60,80);
	}
}