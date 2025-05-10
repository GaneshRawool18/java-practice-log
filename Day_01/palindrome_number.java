import java.util.*;
class PalindromeNumber {
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = obj.nextInt();

		int temp = num ;
		int reverse = 0;
		while(temp != 0){
			int digit  = temp % 10;
			reverse = reverse * 10 + digit;
			temp /= 10;
		}

		if(num == reverse){
			System.out.println(num + " is palindrome number ");
		}else{
			System.out.println(num + " is not a palindrome number ");
		}
			
	}
}
