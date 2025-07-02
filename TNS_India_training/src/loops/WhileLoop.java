package loops;

public class WhileLoop {
	//no of iterations are unknown.
	//used when we want to check the condition and iterate.
	//a.k.a. Entry control loop.
	public static void main(String[] args) {
	int i=1;
	while(i<=100) {
		System.out.println("value of i = "+ i);
		i++;
	}
	}
}
