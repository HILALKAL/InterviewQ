package javafirstpart;

public class ReverseString {

	public static void main(String[] args) {

		// Write a java program to reverse String?

		// Using Reverse Function:
		String str = "Hello Syntax";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

		// Without Using Reverse Function:
		String str1 = "Hello Syntax";

		// ----1st way using charAt();
		String reversed = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			reversed = reversed + str1.charAt(i);
			System.out.println(reversed);
		}

		System.out.println("Reversed string is " + reversed);

		// 2 way using to charArray();

		String b = "";
		char[] arr = str1.toCharArray();
		for (int x = arr.length - 1; x >= 0; x--) {
			b = b + arr[x];

		}
		System.out.println("2 way using to charArray(); " + b);
		
		//3 way using substring
		
		String c="";
		for(int y=str1.length()-1;y>=0;y--) {
			c=c+str1.substring(y, y+1);
		}
		System.out.println("3 way using substring; "+c);
		
		//Reverse a string word by word
		
		String d="";
		String [] array=str1.split(" ");
		for (int z=array.length-1
				;z>=0;z--) {
			d=d+array[z]+" ";
		}
		System.out.println(d);
	}

}
