package conditionalStatements;
import java.util.*;
public class oddeven {
	//homework
	//even odd;
	//prime or not;
	//person eligible for voting or not;
	//person eligible for blood donation or not;
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("given number is even");
        } else {
            System.out.println("odd");
        }
        scan.close();
	}
}
