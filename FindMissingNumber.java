package javainterview;

public class FindMissingNumber {

	public static void main(String[] args) {
	
		
		int a[]={4,5,7};
		int rev=0;
		int rev1=0;
		  for (int i=0; i<a.length;i++)
		  {
			rev= rev+a[i];
			
		  }
		  System.out.println(rev);
		  
		  for (int j=4;j<=7;j++){
			  
				rev1= rev1+j;
			  
		  }
		  
		  System.out.println(rev1-rev);
		  
	}

}
