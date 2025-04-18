public class Mahasiswa {
    String nama = "Farouq";
    String nim = "104";

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(nama) && inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil!");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + nim);
    }
}