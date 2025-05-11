import java.util.*;
class PalindromeString{
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter string : ");
		String str = obj.next();

		StringBuffer sb = new StringBuffer(str);

		if(str.equals(sb.reverse().toString())){
			System.out.println(str + " is a palindrome");
		}else{
			System.out.println(str + " is not a palindrome");
		}

	}
}
