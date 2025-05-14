import java.io.*;
class InputWithBufferedReader {
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Name : ");
		String name = br.readLine();

		System.out.print("Enter age : ");
		int age = Integer.parseInt(br.readLine());


		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}
}

