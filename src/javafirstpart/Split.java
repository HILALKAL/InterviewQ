package javafirstpart;

public class Split {

	public static void main(String[] args) {
		/*
		 * How to find out the part of the string from a string? 
		 * What is substring? 
		 * Find number of words in string?
		 */
		
		String str="Welcome to the interview sessions with Syntax";
		
		String[] word=str.split(" ");
		System.out.println(word.length);
		for(String a:word) {
			System.out.println(a);
		}
		
		
	}

}
