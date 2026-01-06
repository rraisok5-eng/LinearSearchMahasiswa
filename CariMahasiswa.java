public class CariMahasiswa {
    public static void main(String[] args) {

        // Data mahasiswa (NIM dan Nama)
        String[] nim = {"231001", "231002", "231003", "231004", "231005"};
        String[] nama = {"Andi", "Budi", "Citra", "Dewi", "Eka"};

        String cari = "Dewi";  // nama yang dicari
        int posisi = -1;       // posisi awal belum ditemukan
        int perbandingan = 0;  // menghitung jumlah perbandingan
        boolean ditemukan = false;

        // Proses pencarian linear search
        for (int i = 0; i < nama.length; i++) {
            perbandingan++;
            if (nama[i].equalsIgnoreCase(cari)) {
                posisi = i;
                ditemukan = true;
                break;
            }
        }

        // Hasil pencarian
        if (ditemukan) {
            System.out.println("Mahasiswa ditemukan!");
            System.out.println("Nama      : " + nama[posisi]);
            System.out.println("NIM       : " + nim[posisi]);
            System.out.println("Posisi    : indeks ke-" + posisi);
        } else {
            System.out.println("Mahasiswa dengan nama '" + cari + "' tidak ditemukan.");
        }

        System.out.println("Jumlah perbandingan: " + perbandingan);
    }
}
