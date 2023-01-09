package week1.day2;
 

import java.util.Arrays;

public class Missingnumbers {

	public static void main(String[] args) {
		int[] a={1,2,3,5,7,6,8};
		Arrays.sort(a);
		for(int i=1;i<=a.length;i++ )
		{
			if(a[i-1]==i) {
				
				continue;
			}
			else {
				System.out.println("The missing number is "+i);
				break;
				}
		}
	}   

}
