package javainterview;

public class MainMethodOverloading {

	public static void main(String[] args) {
		main(3,6);
	    main(8);
    System.out.println("Actual main method with the signature");
    
    //1)Yes we can perform the main method overloading but we need to make sure that parameter should be different for
    // all the method.
    //2) Without the actual signature main method our program will not execute.
    //3) We can call others main method from actual method by using the main(4,5) like this
    //4 We can call other class main method from current class main method by using the classname.methodname
	}
	public static void main(int a) {
	    System.out.println("value of a  "+a);
		}
	public static void main(int a,int b) {
	    System.out.println("value of a and b  "+a+","+b);
	
}
}