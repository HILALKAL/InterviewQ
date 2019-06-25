package javafirstpart;

public class polindrome {
/*
 * 6. Write a Java Program to find whether a String is palindrome or not.
 */
	public static void main(String[] args) {

String str="bob";
String reverced="";

for (int i=str.length()-1;i>=0;i--) {
	reverced=reverced+str.charAt(i);
}
//System.out.println(reverced);

if(str.equals(reverced)) {
	System.out.println(str+"polindrome");
}else {
	System.out.println(str+"not polindrome");
	
}	
	/*
	 * 6. Write a Java Program to find whether a String is palindrome or not.
	 */
	
	String str1="bob";
	String rev="";
	
for(int i=str1.length()-1;i>=0;i--) {
	rev=rev+str1.charAt(i);
		
	}

if(str1.equalsIgnoreCase(rev)) {
	System.out.println(str1+ " is polindrome");
}else {
	System.out.println(str1+ " is not polindrome");
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	

}
