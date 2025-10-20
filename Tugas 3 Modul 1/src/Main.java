import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        int nilai;

        try {
            System.out.print("Masukkan Nilai Ujian Akhir: ");
            nilai = scanner.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai Harus diantara 0 - 100.");
                scanner.close();
                return;
            }

            String status;
            if( nilai >= 60 ){
                status ="Lulus";
            }else {
                status ="Tidak Lulus";;
            }

            System.out.println("Nama: " + nama + ", Status: " + status);

        } catch (InputMismatchException e) {
            System.out.println("Input Harus berupa angka.");
        }

        scanner.close();
    }
}
/*
Deskripsi Formal:
precondition:User sudah menyiapkan input berupa nama (String) dan nilai (integer).
Input nilai harus berupa bilangan bulat (bukan huruf atau simbol).

command:Menerima input nama dan nilai dari user.
Mengecek kondisi:
Jika nilai ≥ 60 → status = "Lulus".
Jika nilai < 60 → status = "Tidak Lulus".
Menampilkan hasil berupa: Nama: {nama}, Status: {status}.

postcondition:
Program menampilkan status kelulusan berdasarkan nilai.
Jika input salah (bukan angka), program menampilkan pesan error: "Input Harus berupa angka."

Deskripsi informal:
Dibuatnya program ini untuk memudahkan guru mengetahui apakah mahasiswa A lulus
atau tidak berdasarkan nilai ujian akhirnya. Guru akan menginputkan nama mahasiswa
dan nilai ujian akhirnya. Jika nilai akhirnya lebih besar atau sama dengan 60, maka
mahasiswa itu lulus. Sebaliknya, jika nilai akhirnya kurang dari 60, maka mahasiswa itu
tidak lulus.

*/