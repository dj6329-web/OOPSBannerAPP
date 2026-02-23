/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner. This further enhances code readability and maintainability.
 *
 * @author Dewansh
 * @version 5.0
 */

public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare and initialize the String array inline
        // Each line represents one row in the banner for the letters O, O, P, S
        String[] lines = {

            String.join("  ",
                    " ***** ",
                    "*     *",
                    " ***** ",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "*     *"),

            String.join("  ",
                    " ***** ",
                    "*     *",
                    " ***** ",
                    " ***** ")
        };

        // Use enhanced for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}