package week1.day2;

public class Firstintersection {

	public static void main(String[] args) {
	int[] fi= {3,2,11,4,6,7};
	int[] fi2= {1,2,8,4,9,7};
	System.out.println("The intersected value is ");
	for (int i = 0; i < fi2.length; i++) {
	for (int j = 0; j < fi2.length; j++) {
		if(fi[i]==fi2[j]) {
			System.out.print(" "+fi[i]);
		}
	}
	}
	}
}

		
	
	
	


