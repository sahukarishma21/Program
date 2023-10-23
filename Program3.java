public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 
       boolean[] isLetterPresent = new boolean[26]; 
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                isLetterPresent[index] = true;
            }
        }
        boolean isPangram = true;
        for (boolean present : isLetterPresent) {
            if (!present) {
                isPangram = false;
                break;
            }
        }
      if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}