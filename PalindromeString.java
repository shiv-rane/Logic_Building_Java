import java.util.Scanner;
public class PalindromeString {
	public static void main(String[] args) {
		        
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter the string: ");
		        String name = s.nextLine();                 
		          
		            StringBuffer r = new StringBuffer(name);
		            String rev = r.reverse().toString();
		            
		            if(name.equals(rev)){
		                System.out.println("YES");
		            }
		            else{
		                System.out.println("NO");
		            }
		    }
		}