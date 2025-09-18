public class Kantor {
    public static void main(String[] args) {
        // 1. Membuat Objek (instance) dari Class Karyawan
        System.out.println("==== Merekrut Karyawan Baru ====");
        Karyawan karyawan1 = new Karyawan("Revaldi", "00421998", "Programmer", 7500000);
        Karyawan karyawan2 = new Karyawan("William", "00315917", "Staff Marketing", 7000000);
        Karyawan karyawan3 = new Karyawan("James", "00344189", "IT Support", 6500000);

        // 2. Menampilkan profil awal karyawan
        karyawan1.tampilkanProfil();
        karyawan2.tampilkanProfil();
        karyawan3.tampilkanProfil();

    }
}