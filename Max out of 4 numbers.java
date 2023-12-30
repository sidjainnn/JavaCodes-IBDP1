import java.util.Scanner;
public class test1 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int a,b,c,d,largest;
		System.out.print("Enter the 1st integer :");
		a=kb.nextInt();
		largest=a;
		System.out.print("Enter the 2nd integer :");
		b=kb.nextInt();
		if (largest<b)
			largest=b;
		System.out.print("Enter the 3rd integer :");
		c=kb.nextInt();
		if (largest<c)
			largest=c;
		System.out.print("Enter the 4th integer :");
		d=kb.nextInt();
		if (largest<d)
			largest=d;
		{System.out.println("The max number is"+largest);
		
		}

	}

}
