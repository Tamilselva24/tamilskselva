package week1.day2;

public class Palindrome {

			public static void main(String[] args) {
		int num= 32323;
		int num2=0;
		for (int i=num;i!=0;i=i/10){
			num2=i%10;
			num2=(num2*10)+num2;
		}
			if(num2==num){
				System.out.println(num+" is a palindrome");
			}
			else {
				System.out.println(num+" is not a palindrome");
			}

}
			}
