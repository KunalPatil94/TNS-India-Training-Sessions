package loops;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		//comparing a single variable to multiple possible values.
		//used to execute one block of code among many, based on the value of a variable.
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the day name : ");
		String s= scan.nextLine().toLowerCase();
		scan.close();
		switch(s) {
		
		case "monday":
			System.out.println("hello monday");
		break;
		
		case "tuesday":
			System.out.println("hello tuesday");
		break;
		
		case "wednesday":
			System.out.println("hello wednesday");
		break;
		
		case "thursday":
			System.out.println("hello thursday");
		break;
		
		case "friday":
			System.out.println("hello friday");
		break;
		
		case "saturday":
			System.out.println("hello saturday");
		break;
		
		case "sunday":
			System.out.println("hello sunday");
		break;
		
		default:
			System.out.println("not any day! Enter valid details.");
		}
		
		

	}

}
