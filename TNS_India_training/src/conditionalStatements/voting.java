package conditionalStatements;

import java.util.Scanner;

public class voting {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age= scan.nextInt();
        if (age>18){
            System.out.println("citizen is eligible for voting");
        }
        else {
            System.out.println("cannot vote, not eligible.");
        }
        scan.close();
    }

}
