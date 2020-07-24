package javainterview;

public class SwapTwoString {

	public static void main(String[] args) {
		String a="hello";
		String b="world";
		a=a+b;
	   //Changing the value
		b=a.substring(0, a.length()-b.length());
		System.out.println("value of b  "+b);
		
		a=a.substring(b.length(), a.length());
		System.out.println("value of a "+a);
		
		
		
	}

}
