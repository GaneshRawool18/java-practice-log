import java.util.*;

class StrongNumber {
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = obj.nextInt();

		int sum = 0;
		int fact ;

		int temp = num ;

		while(temp != 0){
			fact = 1;
			int digit = temp % 10;
			for(int i=1;i<=digit;i++){
				fact *=i;
			}
			sum += fact;
			temp /= 10;
		}

		if(num == sum){
			System.out.println(num + " is strong number ");
		}else{
			System.out.println(num + " is not strong number ");
		}
	}
}
