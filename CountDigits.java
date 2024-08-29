import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int digits;
	int count=0;
	System.out.println("Enter the digit: ");
	digits = scan.nextInt();
		if(digits==0) {
		System.out.println("1");
		}
		else {
			while(digits!=0) {
			count++;
			digits=digits/10;
			}
		System.out.println(count);
		}
		}
			
	}
