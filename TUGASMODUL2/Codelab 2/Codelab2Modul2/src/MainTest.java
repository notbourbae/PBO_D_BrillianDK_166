public class MainTest {
    public static void main(String[] args) {

        rekeningbank rekening1 = new rekeningbank();
        rekeningbank rekening2 = new rekeningbank();

        rekening1.namaPemilik = "Brillian Daniar Kautama";
        rekening2.namaPemilik = "Bintang Susilo";

        rekening1.nomorRekening = "202410370110166";
        rekening2.nomorRekening = "202410370110159";

        rekening1.saldo = 5000000.0;
        rekening2.saldo = 500.0;

        rekening1.setorUang(200000.0);
        rekening2.setorUang(500.0);
        System.out.println();

        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);
        System.out.println();

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}