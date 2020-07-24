package javainterview;

public class StringManipulation {
	
public static void main(String[] args) {
	
	String str="learning selenium with java";
	String str1="testing";
	 System.out.println(str.length()); // gives you the lenght of the string
	 System.out.println(str.charAt(5));
	 System.out.println(str.indexOf('g'));
	 System.out.println(str.indexOf('l', 7));
	 System.out.println(str.indexOf('n', str.indexOf('n')+1));
	 System.out.println(str.equals(str1));
	 System.out.println(str.equalsIgnoreCase(str1));// ignore the case sensitive and then compare
	 System.out.println(str==str1);
	 System.out.println(str.substring(5));
	 System.out.println(str.substring(4, 15));
	 System.out.println(str.trim());// remove space
	 System.out.println(str.replace('l', 't'));// used to replace the character
	 String tester="how_are_you";
	 String newstring[]=tester.split("_"); // divide the string in multiple parts based on the context provided
	 for(String hello: newstring)
	 {
		 System.out.println(hello);
	 
	 }
}
}
