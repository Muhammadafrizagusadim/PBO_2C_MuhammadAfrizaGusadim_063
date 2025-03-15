public class Main {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("202410370110063", "Muhammad afriza Guadim",100000);
        RekeningBank rekening2 = new RekeningBank("202410370110103","Taufiqrahman", 100000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(200000);
        rekening2.tarikUang(700000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}