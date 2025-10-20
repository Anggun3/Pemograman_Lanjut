import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        while (true) {
            try {
                System.out.print("Masukkan angka positif: ");
                angka = scanner.nextInt();

                if (angka <= 0) {
                    throw new InvalidNumberException("Error: Angka harus lebih besar dari 0.");
                }

                System.out.println("Angka valid positif: " + angka);
                break;

            } catch (InputMismatchException e) { //inputan selain bilangan
                System.out.println("Error: Input harus berupa angka bulat positif.");
                scanner.nextLine();
            } catch (InvalidNumberException e) { //0 - -angka
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}