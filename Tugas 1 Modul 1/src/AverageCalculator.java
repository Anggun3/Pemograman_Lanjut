import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Angka: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah harus lebih dari 0.");
            return;
        }

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukan Angka ke-" + (i+1) + ": ");
            try {
                angka[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Masukan bilangan bulat.");
                scanner.next();
                i--;
            }
        }

        int total = 0;
        for (int i = 1; i<n ; i++){ // perulangan start 0 bukan 1
            total+= angka[i];
        }

        double rataRata = (double) total / n ;
        System.out.println("Rata-rata adalah: " + rataRata);

        scanner.close();
    }
}