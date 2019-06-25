package javafirstpart;

public class StringReplace {

	public static void main(String[] args) {
		
		
		String str="ajfiucfmcoAFHGVJHKJ&**()^^~1234";
		
		String replaced=str.replaceAll("[^A-Za-z]","");
		
		System.out.println(replaced);
		System.out.println(replaced.length());
		
	
	}

}
