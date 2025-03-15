public class RekeningBank {
    String Norek;
    String NamaRek;
    double SaldoRek;

    public RekeningBank( String Norek, String NamaRek, double SaldoRek){
        this.Norek = Norek;
        this.NamaRek = NamaRek;
        this.SaldoRek = SaldoRek;
    }
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + Norek);
        System.out.println("Nama Pemmilik: " + NamaRek);
        System.out.println("Saldo: Rp." + SaldoRek);
        System.out.println();
    }
    public void setorUang(double jumlah){
        if(jumlah > 0){
            SaldoRek += jumlah;
            System.out.println("Anda Menyetorkan Unag Rp." + jumlah +".Saldo sekarang: Rp." + SaldoRek);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0");
        }
        System.out.println();
    }
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= SaldoRek) {
            SaldoRek -= jumlah;
            System.out.println("Anda menarik Rp" + jumlah + ". Saldo sekarang: Rp" + SaldoRek);
        } else {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi atau jumlah tidak valid.");
        }
        System.out.println();
    }
}
