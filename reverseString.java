package javainterview;

public class reverseString {

	public static void main(String[] args) {
  String str ="naveenautomationlab";
   int len= str.length();
   String rev="";
   
   for (int i=len-1; i>=0; i--)
   {
	   rev= rev + str.charAt(i);
   }
   System.out.println(rev);
  	
		// By using string buffer
		StringBuffer str1= new StringBuffer(str);
		System.out.println(str1.reverse());
	}

}
