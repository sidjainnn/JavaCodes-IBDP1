import java.util.Scanner;
public class Divison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int number1,number2,quocient;
		double remainder;
		System.out.print("Enter a number");
		number1= input.nextInt();
		
		System.out.print("Enter a number you would like to divide the previous with");
		number2=input.nextInt();
		
		quocient= number1/number2;
		remainder= number1 % number2;
		
		System.out.println("the quocient is :" + quocient);
		if (remainder == 0) {
			System.out.println("The number is totally divisble so now remainder");
		}
		else {
			System.out.println("The remainder is:" + remainder);
		}
		
		
		
				
		
		
		
		
				
		

	}

}
