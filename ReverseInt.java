import java.util.Scanner;
public class ReverseInt {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int r , n , s=0;
		System.out.println("Enter the integer: ");
		n = read.nextInt();
		
		while(n!=0) {
			
			r = n % 10;
			s =  s * 10 +r;
			n = n /10;
		}
		System.out.println(s);
	}

}
