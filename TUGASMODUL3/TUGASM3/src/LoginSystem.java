import java.util.Scanner;

class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public boolean login(String input1, String input2) {
        return false;
    }

    public void displayInfo() {
        System.out.println("Informasi User:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nLogin Admin Berhasil!");
        System.out.println("Selamat datang, " + getNama() + "!");
        System.out.println("Hak akses: Administrator");
    }
}

class Mahasiswa extends User {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equalsIgnoreCase(inputNama) && getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nLogin Mahasiswa Berhasil!");
        System.out.println("Selamat datang, " + getNama() + "!");
        System.out.println("NIM Anda: " + getNim());
    }
}

class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin Sistem", "ADM001", "admin", "admin");
        Mahasiswa mahasiswa = new Mahasiswa("brillian", "202410370110166");

        System.out.println("=== SISTEM LOGIN ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih jenis login (1/2): ");

        String pilihan = scanner.nextLine();

        switch (pilihan) {
            case "1":

                System.out.print("\nUsername: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
                    admin.displayInfo();
                } else {
                    System.out.println("\nUsername atau password salah!");
                }
                break;

            case "2":

                System.out.print("\nNama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("\nNama atau NIM salah!");
                }
                break;

            default:
                System.out.println("\nPilihan tidak valid!");
                break;
        }

        scanner.close();
    }
}