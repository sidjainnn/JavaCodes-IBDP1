import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner LO= new Scanner(System.in);
		String name1;
		int password;
		System.out.print("Enter your name :");
		name1 = LO.next();
		
		System.out.print("Enter your password");
		password = LO.nextInt();
		
		
		
		Person p = new Person(name1);
		System.out.println(p.getname() );
		Pass w = new Pass (password);
		
		
		
		
				
	}

}
