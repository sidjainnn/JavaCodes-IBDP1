
public class main {
	//for a square

	public static void main(String[] args) {
		int side = 25; 
		int area = side*side;
		int perimeter = (side+side)+(side+side);
		double diagonal = Math.sqrt(2*(25*25));
		
		System.out.println("The length of 1 side is :" +side);
		System.out.println("Area :" +area);
		System.out.println("Perimeter:" +perimeter);
		System.out.println("Diagonal: " +diagonal);

	}

}
