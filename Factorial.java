import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int sum = 0;
		int result = 1;
		System.out.println("enter to find factorial: ");
		n = scan.nextInt();
		for (int i = 1; i<=n;i++) {
			result *= i;
			sum = result;
		}
		System.out.println("Factorial of " + n + " is " + sum);
		
	}

}
