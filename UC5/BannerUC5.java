public class BannerUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization using String.join()
        String[] banner = {
            String.join("", "***************"),
            String.join("", "*             *"),
            String.join("", "*   OOPS APP  *"),
            String.join("", "*   BANNER    *"),
            String.join("", "*             *"),
            String.join("", "*   UC5 DEMO  *"),
            String.join("", "***************")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}