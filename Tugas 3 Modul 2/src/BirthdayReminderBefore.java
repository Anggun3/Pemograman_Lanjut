import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayReminderBefore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Pengingat Ulang Tahun ===");
        System.out.print("Masukkan nama teman: ");
        String name = input.nextLine();

        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String date = input.nextLine();

        LocalDate birthDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate today = LocalDate.now();

        if (birthDate.getMonth() == today.getMonth() && birthDate.getDayOfMonth() == today.getDayOfMonth()) {
            System.out.println("Hari ini ulang tahun " + name + "! Jangan lupa beri ucapan ");
        } else {
            System.out.println("Bukan hari ulang tahun " + name + ".");
        }

        input.close();
    }
}

