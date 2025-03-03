import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menentukan jenis kelamin dalam teks
        String jenisKelaminTeks = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        // Menghitung umur
        int umur = 2025 - tahunLahir; // Asumsikan tahun saat ini adalah 2025

        // Menampilkan hasil
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminTeks);
        System.out.println("Umur          : " + umur + " tahun");

        scanner.close();
   }
}
