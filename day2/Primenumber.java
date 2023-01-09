package week1.day2;

public class Primenumber {
	
	public static void main(String[] args) {
	    int num=13;
	    boolean prime=false;
	for (int i = 2; i <=num/2; i++) {//13%2==0->false,
	if(num%i==0) {
		prime=true;
		break;
	}
		
		
	}
	if(prime) {
		System.out.println(num+" is not a primenumber");
		
	}
	else {
		System.out.println(num+" is a primenumber");
	}
		
	}

}
