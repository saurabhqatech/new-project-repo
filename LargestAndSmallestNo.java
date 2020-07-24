package javainterview;

import java.util.Arrays;

public class LargestAndSmallestNo {

	public static void main(String[] args) {
      int arr[]={25,46,78,14,896,0,47,-5,02,3,76,4758};
      int smallest=arr[0];
      int largest=arr[0];
       for(int i=1;i<arr.length;i++)
       {
    	   if (arr[i]>largest)
    	   {
    		   largest =arr[i];
    	   }
    	   else
    	   {
    		   if (smallest > arr[i])
       		   smallest =arr[i];
    	   }
       }System.out.println(Arrays.toString(arr));
       System.out.println(smallest);
       System.out.println(largest);
	}

}
