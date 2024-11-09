
public class DuplicateWords {
	
	public static void findDuplicate(String str) {
		
		for(int i = 1; i<str.length();i++) {
			if(str.charAt(i-1)==str.charAt(i)) {
				System.out.println(str.charAt(i-1));
			}
		}
	}
	
	public static void main(String[] args) {
	String str = "ABBCC";
	str = str.toLowerCase();
	findDuplicate(str);
	}
}
