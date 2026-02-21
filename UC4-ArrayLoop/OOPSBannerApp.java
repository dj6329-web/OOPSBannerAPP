/*
 * UC4 - Render OOPS as Banner using String Array and Loop
 * Using String Array + String.join() + for-each loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to hold 7 banner lines
        String[] lines = new String[7];

        // Populate array using String.join()

        lines[0] = String.join("  ",
                " ***** ",
                "*     *",
                " ***** ",
                " ***** ");

        lines[1] = String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        lines[2] = String.join("  ",
                "*     *",
                "*     *",
                " ***** ",
                " ***** ");

        lines[3] = String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "      *");

        lines[4] = String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "      *");

        lines[5] = String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "*     *");

        lines[6] = String.join("  ",
                " ***** ",
                "*     *",
                " ***** ",
                " ***** ");

        // Use enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
