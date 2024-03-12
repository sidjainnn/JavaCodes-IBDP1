
public class main {

	public static void main(String[] args) {
		int p = 10000;
		double tax = 0.1; 
		double value = p*tax; 
		double total = p+value;
		total = (int) total; 
		System.out.println("The tax is on this is :" +value);
		System.out.print("Total Amount To Be Paid is :" +total);
		
		

	}

}
