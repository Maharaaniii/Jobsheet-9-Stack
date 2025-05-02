public class Surat23 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat23() {

    }

    Surat23(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;

    }

    public void tampilkanSurat() {
        System.out.println("ID Surat    : " + idSurat);
        System.out.println("Nama        : " + namaMahasiswa);
        System.out.println("Kelas       : " + kelas);
        String keterangan;
        if (jenisIzin == 'S') {
            keterangan = "Sakit";
        } else if (jenisIzin == 'I') {
            keterangan = "Izin";
        } else if (jenisIzin == 'A') {
            keterangan = "Alpa";
        } else {
            keterangan = "Tidak Diketahui";
        }
        System.out.println("Jenis Izin  : " + jenisIzin);
        System.out.println("Durasi      : " + durasi + " Hari");

    }
}
