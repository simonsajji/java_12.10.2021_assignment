package stringss;

public class Vowels_Consonants {
	
	public static void main(String args[]) {
		
		String input="This is a really simple sentence";
		input=input.toLowerCase();
		int vowels=0;
		int cons=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=' ') {
				if(input.charAt(i)=='a' || input.charAt(i)=='e'|| input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'  ) {
					vowels++;
				}
				else {
					cons++;
				}
				
			}
			
		}
		System.out.println("Vowels:- "+vowels);
		System.out.println("Consonants:- "+cons);
		
	}

}
