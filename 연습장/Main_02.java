public class Main_02 {
    public static void main(String... args) {
        int i = 0;
        int c = 0;

        while (i < 10) {
            i++;
            c *= i;
        }

        System.out.println(c);
    }
}