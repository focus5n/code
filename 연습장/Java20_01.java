/**
 * Java20_01
 */
public class Java20_01 {

    static int[] arr() {
        var a = new int[4];
        var b = a.length;

        for (int i = 0; i < b; i++) {
            a[i] = i;
        }

        return a;
    }

    public static void main(String... args) {
        int a[] = arr();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}