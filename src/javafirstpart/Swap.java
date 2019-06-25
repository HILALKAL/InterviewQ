package javafirstpart;

public class Swap {

	public static void main(String[] args) {
	/*
	 * Write a program to swap 2 numbers without a temporary variable? 	
	 */
		
		int a=10;
		int b=20;
		
		a=a+b;//10+20=30;
		b=a-b;//30-20=10;
		a=a-b;//30-10=20;
		
		System.out.println(a);
		System.out.println(b);
		
		/*
		 * Swap 2 strings without a temporary variable?
		 */
		String x="Hello";
		String y="Bye";
		
		x=x+y;//HelloBye;
		y=x.substring(0,(x.length()-y.length()));//Hello;
		x=x.substring(y.length());//Bye
		
		System.out.println(x);
		System.out.println(y);

	
	
	}
}
