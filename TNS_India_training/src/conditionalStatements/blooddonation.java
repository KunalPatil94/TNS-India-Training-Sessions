package conditionalStatements;
import java.util.*;
public class blooddonation {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age= scan.nextInt();
        System.out.println("Enter the weight : ");
        int wt=scan.nextInt();
        
        if (age>18 && wt>50 && age<60){
            System.out.println("citizen is eligible for donation");
        }
        else {
            System.out.println("cannot donate, not eligible.");
        }
        scan.close();
    }
}


