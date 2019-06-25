package javafirstpart;
import java.util.Arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		//1st way
		int [] numArray= {15,46,93,2,6,-3};
		Arrays.sort(numArray);
		int min=numArray[0];
		int max=numArray[numArray.length-1];
		
		System.out.println("Min number is "+min+" max num is "+max);
		
		//2nd way
		
		int [] array= {6,36,-15,89,300};
		int smallest=0;
		int biggest=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>biggest) {
				biggest=array[i];
			}else {
				smallest=array[i];
			}
			
		}
		System.out.println(biggest);
		System.out.println(smallest);
		
		
		
		
		
		
		
		
		
		
		
	}

}
