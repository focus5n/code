public class Java모의고사01 {

    public static int a = 5;

    public static void main(String... args) {
        int b = 2;
        calculater(b);
        calculater(b);
        System.out.printf("%d, %d\n", a, b);
    }

    static void calculater(int b) {
        if (b < a) {
            a -= 3;
        } else {
            b += 3;
        }
    }
}