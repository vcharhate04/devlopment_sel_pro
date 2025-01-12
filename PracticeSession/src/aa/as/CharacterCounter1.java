package aa.as;

public class CharacterCounter1 {

	

	    public static int countCharacters(String str) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            count++;
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String str = "hello world";
	        int charCount = countCharacters(str);
	        System.out.println("Number of characters in the string: " + charCount);
	    }
	}	
	

