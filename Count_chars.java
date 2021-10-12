package stringss;

// Count the characters in string excluding the spaces
public class Count_chars {
	public static void main(String args[]) {
		String input="The best of both worlds";
		int count=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch!= ' ') {
				count=count+1;
			}
		}
		System.out.println(count);
		
		
	}

}
