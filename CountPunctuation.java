package stringss;
import java.util.regex.*;

public class CountPunctuation {  
    public static void main (String [] args) {  
        //Stores the count of punctuation marks  
        int countPuncMarks = 0;  
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";  
        for (int i = 0; i < str.length(); i++) {  
                //Checks whether given character is punctuation mark  
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
                countPuncMarks++;  
            }  
        }  
        System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);  
    }  
}  


