import java.util.Scanner;
public class SuratDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat23 stack = new StackSurat23();
        int pilih;

        do {
            System.out.println("\n=====Menu=====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama       : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas      : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis izin : ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi     : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Id surat   : ");
                    String idSurat = sc.nextLine();
                    sc.nextLine();
                    Surat23 srt = new Surat23(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.terimaSurat(srt);
                    System.out.println("Surat berhasil diterima!");
                    break;
                case 2:
                    Surat23 suratDiproses = stack.prosesSurat();
                    if (suratDiproses != null) {
                        System.out.println("Surat sedang diproses");
                        suratDiproses.tampilkanSurat();
                        System.out.println("Surat telah diproses");
                    } else {
                        System.out.println("Tidak ada surat yang bisa diproses.");
                    }
                    break;
                case 3:
                    Surat23 lihatSuratTeratas = stack.lihatSuratTerakhir();
                    if (lihatSuratTeratas != null) {
                        System.out.println("Surat paling atas adalah surat " + lihatSuratTeratas.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari:");
                    String namaCari = sc.nextLine();
                    Surat23 suratDitemukan = stack.cariSurat(namaCari);
                    if (suratDitemukan != null) {
                        System.out.println("Surat ditemukan dari mahasiswa: ");
                        suratDitemukan.tampilkanSurat();
                    } else {
                        System.out.println("Surat izin tidak ditemukan dari mahasiswa: " + namaCari);
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);

    }
}
