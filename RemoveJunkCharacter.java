package javainterview;

public class RemoveJunkCharacter {

	public static void main(String[] args) {
		
		String str ="@@##!$@#.2  saura &*^*^ bh 558**&&&#$i";
		String test = str.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println(test);
	
	}

}
