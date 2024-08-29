import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	
	public static boolean isAnagram(String s1 , String s2) {
		
		char[] string1 = s1.toCharArray();
		char[] string2 = s2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		return Arrays.equals(string1, string2);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two string to check anagram: ");
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		boolean result = Anagram.isAnagram(str1, str2);
		System.out.println(result);
	}
}
