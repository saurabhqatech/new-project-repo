package javainterview;

public class SwapIntergerValue {

	public static void main(String[] args) {
 //1  Using third variable
    int a=10;
    int b=5;
    int c;
    
    c=a;
    a=b;
    b=c;
    System.out.println(a+"\n" +b);
    //2   without using plus + operator
        a=a+b;
        b=a-b;
        a=a-b;
     //3    Using * operator
        a=a*b;
        b=a/b;
        a=a/b;
      //4     using xor ^ 
        
        a=a^b;
        b=a^b;
        a=a^b;
       
	}

}
