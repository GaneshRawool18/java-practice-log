import java.util.*;

class MinElements{
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int size = obj.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter array element : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = obj.nextInt();

		}

		int min = arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}

		System.out.println("Min element in the array is " + min);
		
	}
}


