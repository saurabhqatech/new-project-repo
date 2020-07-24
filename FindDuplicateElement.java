package javainterview;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		String lang[]={"java","python","Ruby","C++","Rail","Perl"};
		//Comparing each element
		for(int i=0;i<lang.length;i++)
		{ 
		for(int j=i+1;j<lang.length;j++)
		{
        if(lang[i].equals(lang[j]))
	    System.out.println("duplicate value is present"+"" +lang[i]);
		}
		}
		
    //using hashset: It contains only unique values
     Set<String> store= new HashSet<String>();
      for(String test3: lang)
      { if(store.add(test3)==false)
    	  System.out.println("dupliacate value"+test3);
      }
}}