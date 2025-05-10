import java.util.*;
class EvenOdd {
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = obj.nextInt();

		if(num % 2 == 0){
			System.out.println(num + " is even number ");
		}else{
			System.out.println(num + " is odd number ");
		}

	}
}
