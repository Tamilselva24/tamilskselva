package week1.day2;

public class Fibonacc {
	    

	public static void main(String[] args) {
		
	
		
		int num=8;
		int sum,a1=0,a2=1;
		System.out.println(a1);
		System.out.println(a2);
		for(int i=2;i<num;i++) {
			sum=a1+a2;
			a1=a2;
			a2=sum;
			
			System.out.println(sum);
		}
	}

}
