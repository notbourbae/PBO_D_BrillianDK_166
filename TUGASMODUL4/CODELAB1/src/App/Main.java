package App;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new NonFiksi("Retorika", "Aris Toteless", "Sejarah");
        Buku buku2 = new Fiksi("Conan Detective", "Gosho Aoyama", "Action");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota anggota1 = new Anggota("Brillian Daniar Kautama", "166");
        Anggota anggota2 = new Anggota("Bintang Susilo", "159");

        anggota1.displayInfo();
        anggota2.displayInfo();

        anggota1.pinjamBuku("Retorika", 5);
        anggota2.pinjamBuku("Conan Detective", 10);

        anggota1.kembalikanBuku("Retorika");
        anggota2.kembalikanBuku("Conan Detective");
    }
}