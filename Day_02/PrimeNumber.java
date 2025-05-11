import java.util.*;
class PrimeNumber {
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = obj.nextInt();

		int count = 0;

		for(int i = 1; i < num ; i++){
			if(num % i == 0){
				count++;
			}
		}

		if(count == 1){
			System.out.println(num + " is prime number ");
		}
	}
}
