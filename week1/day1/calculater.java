package week1.day1;

public class calculater {
	public void subtractnumbers() {
		int a=2;
	    int b=4;
	    System.out.println(b-a);
	    }
	public int mulitple(int a,int b) {
		return a*b;
				
	}

	public static void main(String[] args) {
		calculater cl=new calculater();
				cl.subtractnumbers();
		System.out.println(cl.mulitple(7,8));

	}

}
