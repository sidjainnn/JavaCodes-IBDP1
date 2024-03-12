
public class main {

	public static void main(String[] args) {
		int price = 7200; 
		double d1 = 0.2; 
		double d2 = 0.1; 
		double v1 = price*d1; 
		double v2 = price - v1; 
		double v3 = v2*d2;
		double v4 = v2 - v3; 
		
		int total = (int) v4; 
		double disc = v1+v3; 
		
	System.out.println("The amount of discount is : "+(int) disc);
	System.out.println("The total price is :" +total); 
		
		

	}

}
