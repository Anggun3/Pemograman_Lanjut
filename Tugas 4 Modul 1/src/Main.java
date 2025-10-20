public class Main {
    public static int findMin (int a, int b, int c)
    {
        if (a <= b && a <= c ){
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int hasil1 = findMin(1, 2, 3);
        System.out.println("Skenario 1 (1, 2, 3) Hasil: " + hasil1);

        int hasil2 = findMin(-1, -2, -3);
        System.out.println("Skenario 2 (-1, -2, -3) Hasil: " + hasil2);

        int hasil3 = findMin(0, 0, 1);
        System.out.println("Skenario 3 (0, 0, 1) Hasil: " + hasil3);
    }
}