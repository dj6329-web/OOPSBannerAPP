/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing an Inner Class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays
 * the "OOPS" banner using these stored mappings.
 */

public class OOPSBannerApp {

    // -------------------------------
    // Inner Class
    // -------------------------------
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // -------------------------------
    // Create Character Pattern Maps
    // -------------------------------
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap oMap = new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        CharacterPatternMap pMap = new CharacterPatternMap('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap sMap = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return new CharacterPatternMap[]{oMap, pMap, sMap};
    }

    // -------------------------------
    // Get Pattern for Character
    // -------------------------------
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return null;
    }

    // -------------------------------
    // Print Banner Message
    // -------------------------------
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        String[][] patterns = new String[message.length()][];

        for (int i = 0; i < message.length(); i++) {
            patterns[i] = getCharacterPattern(message.charAt(i), maps);
        }

        int rows = patterns[0].length;

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < patterns.length; c++) {
                System.out.print(patterns[c][r] + "  ");
            }

            System.out.println();
        }
    }

    // -------------------------------
    // Main Method
    // -------------------------------
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}