package conditionalStatements;
import java.util.*;
public class Primenumber {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= scan.nextInt();
        if(isprime(n)) {
        	System.out.println("the number is prime.");
        }
        else {System.out.println("the number is not prime.");}

        scan.close();
    }
    static boolean isprime(int n) {
        if (n<=1) {
            return false;
        }
        for (int i = 2; i <n/2; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

}
