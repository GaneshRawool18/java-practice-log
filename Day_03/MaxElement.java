import java.util.*;
class MaxElementInArray {
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter Size of an array : ");
		int size = obj.nextInt();

		System.out.print("Enter elements : ");
		int[] arr = new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i] = obj.nextInt();
		}

		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		System.out.println("Max element in array is " + max);
	}
}


