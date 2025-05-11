import java.util.*;
class CountDigitNumber {
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = obj.nextInt();

		int temp = num ;
		int count = 0;
		while(temp != 0){
			temp /= 10;
			count++;
		}

		System.out.println("Count digit in " + num + " is " + count );
	}
}
