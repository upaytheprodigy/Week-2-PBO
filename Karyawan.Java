public class Karyawan {
    // Atribut dibuat private
    private String nama;
    private String nik; // Nomor Induk Karyawan
    private String jabatan;
    private double gaji;

    // Constructor
    public Karyawan(String nama, String nik, String jabatan, double gaji) {
        this.nama = nama;
        this.nik = nik;
        this.jabatan = jabatan;
        this.gaji = gaji;
        System.out.println("Karyawan baru '" + this.nama + "' berhasil ditambahkan.");
    }

    // --- PUBLIC METHODS (GETTER & SETTER) SEBAGAI JEMBATAN ---

    // Getter
    public String getNama() {
        return this.nama;
    }

    public String getNik() {
        return this.nik;
    }

    public String getJabatan() {
        return this.jabatan;
    }
    
    public double getGaji() {
        return this.gaji;
    }

    }

    // Method untuk menampilkan profil karyawan
    public void tampilkanProfil() {
        System.out.println("\n===================================");
        System.out.println("         PROFIL KARYAWAN           ");
        System.out.println("===================================");
        System.out.println("Nama             : " + this.nama);
        System.out.println("NIK              : " + this.nik);
        System.out.println("Jabatan          : " + this.jabatan);
        System.out.printf("Gaji             : Rp%,.2f\n", this.gaji);
        System.out.println("===================================\n");
}
