import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    // Map to store Roman characters and their integer values
    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        // Initialize the map with Roman numeral values
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }
        return total;
    }

    public static void main(String[] args) {
        // Example usage of the method
        String romanNumeral = "MCMXCIV";
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is " + result);
    }
}
