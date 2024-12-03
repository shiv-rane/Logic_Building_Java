import java.util.Scanner;
class CheckVowels{
    
	public static String reverse(String s) {
		
		char[] str = s.toCharArray();
		
		int first = 0;
		int last = s.length()-1;
		
		while(first<last) {
			if(str[first]!='a' && str[first]!='e'  && str[first]!='i' && str[first]!='o' && str[first]!='u') {
				first++;
			}
			else if(str[last]!='a' && str[last]!='e'  && str[last]!='i' && str[last]!='o' && str[last]!='u') {
				last--;
			}
			else {
				char temp = str[first];
				str[first] = str[last];
				str[last] = temp;
				first++;
				last--;
			}
		}
		String str2 = new String(str);
		return str2;
	}
	
	
	
	public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter string");
        String x = scan.nextLine();
        
       
        System.out.print(reverse(x));
        
        }
    }
