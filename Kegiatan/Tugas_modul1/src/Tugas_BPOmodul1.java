import java.util.Scanner;

public class Tugas_BPOmodul1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {

                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                String validUsername = "admin001";
                String validPassword = "2005";

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            } else if (pilihan == 2) {

                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                String validNama = "Muhammad afriza gusadim";
                String validNim = "063";

                if (nama.equals(validNama) && nim.equals(validNim)) {
                    System.out.println("Login Mahasiswa berhasil!");
                    System.out.println("Nama: " + nama);
                    System.out.println("Nim: " + nim );
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            scanner.close();
        }
    }