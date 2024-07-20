import java.util.Scanner;
public class sumofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n = 50;
		for (int i=1 ; i<=n;i++) {
			sum+=i;
			System.out.println(sum);
		}
	}

}
