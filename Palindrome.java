import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int r , n , s=0 , temp;
		System.out.println("Enter the integer: ");
		n = read.nextInt();
		temp = n;
		while(n!=0) {
			
			r = n % 10;
			s =  s * 10 +r;
			n = n /10;
		}
		System.out.println(s);
		
		if(s==temp) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
