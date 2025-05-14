import java.util.*;
class PerfectNumber {
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = obj.nextInt();
		int sum = 0;
		for (int i=1;i< num ;i++){
			if(num % i == 0){
				sum += i;
			}
		}

		if(num == sum){
			System.out.println(num + " is a perfect number ");
		}else{
			System.out.println(num + " is not a perfect number ");
		}
	}
}
