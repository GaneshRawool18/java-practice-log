import java.util.*;
class CountVowelsConsonants {
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter Name : ");
		String str = obj.next();

		int vCount = 0;
		int cCount = 0;

		str = str.toLowerCase();

		for(int i = 0 ; i < str.length();i++){
			char ch = str.charAt(i);

			if(Character.isLetter(ch)){
				if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					vCount++;
				}else{
					cCount++;
				}
			}
		}

		System.out.println("Vowels count is " + vCount);
		System.out.println("Consonants count is " + cCount);
	}
}


