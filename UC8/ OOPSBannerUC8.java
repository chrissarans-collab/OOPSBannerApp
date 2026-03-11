import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        // HashMap to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";
        printBanner(word, patternMap);
    }

    // Function to render banner
    public static void printBanner(String word, Map<Character, String[]> patternMap) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}