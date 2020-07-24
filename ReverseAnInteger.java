package javainterview;

public class ReverseAnInteger {

	public static void main(String[] args) {
		//12345
	
		int a=123456;
	    int rev =0;
	    while(a!=0)
		{
			rev= rev*10+ a%10;
			a=a/10;
			}
		System.out.println(rev);	
	}
}
