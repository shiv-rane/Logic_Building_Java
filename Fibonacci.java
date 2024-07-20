import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fib, a=0,b=1,c;//why a and b , because to add previous number and c to store that number;
		System.out.println("enter the number: ");
		fib = scan.nextInt();
		for(int i = 1; i<=fib ; i++) {
			System.out.println(b);
			c=a+b;
			
			a=b;
			b=c;
		}
		
	}

}
