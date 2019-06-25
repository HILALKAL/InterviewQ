package javafirstpart;

public class primeNumber {
/*
 * 7. Write a java program to check whether a given number is prime or not?
 */
	public static void main(String[] args) {
		
		int num=99;
		boolean flag=false;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(num+" is not prime number");
		}else {
			System.out.println(num+"is a prime number");
		}
	}

}
