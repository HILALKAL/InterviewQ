package javafirstpart;
import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array?
		 */
		
		//1st way
		
		int[] num= {2,3,54,11,-4};
		Arrays.sort(num);
		System.out.println(num[num.length-2]);
		
		
		//2nd way
		
		int [] array= {100,56,78,9,300};
		int largest=0;
		int secondLargest=0;
		
		for(int i=0; i<array.length;i++) {
			if(array[i]>largest) {
				secondLargest=largest;
				largest=array[i];
				
			}else if(array[i]>secondLargest&&array[i]!=largest) {
				secondLargest=array[i];
			}
		}
		System.out.println("The largest number= "+largest+" and secondLargest= "+secondLargest);
		
		
		
	}
	
	

}
