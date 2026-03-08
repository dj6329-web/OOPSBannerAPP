import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // ------------------------------
    // Utility Method
    // Create Map for Character Patterns
    // ------------------------------
    public static Map<Character, String[]> createCharacterMap() {

        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        charMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        charMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return charMap;
    }

    // ------------------------------
    // Utility Method
    // Print Banner
    // ------------------------------
    public static void printBanner(String message, Map<Character, String[]> charMap) {

        int rows = charMap.get(message.charAt(0)).length;

        for (int i = 0; i < rows; i++) {

            StringBuilder outputLine = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                outputLine.append(pattern[i]).append("   ");
            }

            System.out.println(outputLine.toString());
        }
    }

    // ------------------------------
    // Main Method
    // ------------------------------
    public static void main(String[] args) {

        Map<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        printBanner(message, charMap);
    }
}