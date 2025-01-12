package aa.as;

public class CharacterCounter {

	
	public static void countCharacters(String str) {
        int[] charCounts = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        System.out.println("Character Counts:");
        for (int i = 0; i < 256; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        countCharacters(inputString);
    }
}
