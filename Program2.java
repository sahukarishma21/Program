import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        String romanNumeral = "IX"; 
      int result = 0;
        int prevValue = 0;
      for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(romanNumeral.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
             prevValue = currentValue;
        }
       System.out.println("Integer value of " + romanNumeral + " is: " + result);
    }
}
