import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek dari kelas masyarakat
        masyarakat dataMasyarakat = new masyarakat();
        petugas dataPetugas = new petugas();
        barang dataBarang = new barang();
        lelang dataLelang = new lelang();


        System.out.println("=== DETAIL MASYARAKAT ===");
        System.out.print("Masukkan Nama: ");
        String namaMasyarakatt = scanner.nextLine();
        dataMasyarakat.setnama(namaMasyarakatt);

        System.out.print("Masukkan Alamat: ");
        String alamatMasyarakatt = scanner.nextLine();
        dataMasyarakat.setalamat(alamatMasyarakatt);

        System.out.print("Masukkan Telepon: ");
        String teleponMasyarakatt = scanner.nextLine();
        dataMasyarakat.settelepon(teleponMasyarakatt);

        System.out.println("=================================");
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();
        dataBarang.setNamaBarang(namaBarang);

        System.out.print("Masukkan Harga Awal ");
        int inputAwal = scanner.nextInt();
        dataBarang.setHargaAwal(inputAwal);

        System.out.print("Masukkan Status (true/false): ");
        boolean status = scanner.nextBoolean();
        dataBarang.setStatus(status);

        scanner.nextLine(); // RESETTER


        boolean statusBarang = dataBarang.getStatus().get(0);

        if (statusBarang == true) {
            System.out.println("=== DETAIL PEUGAS ===");
            System.out.print("Masukkan Nama:");
            String nama = scanner.nextLine();
            dataPetugas.setnama(nama);

            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();
            dataPetugas.setalamat(alamat);

            System.out.print("Masukkan Telepon: ");
            String telepon = scanner.nextLine();
            dataPetugas.settelepon(telepon);

            System.out.println("Masukkan Maksimal Penawaran");
            int jumlahpenawaran = scanner.nextInt();
            dataPetugas.setJmpenawar(jumlahpenawaran);

            System.out.println("===================================");
            System.out.println("Jumlah Penawar Yang Di Izinkan = "+dataPetugas.getJmpenawar());

            for (int i = 1; i <= dataPetugas.getJmpenawar(); i++) {
                System.out.println("Masukkan Id Anda");
                int idnawar = scanner.nextInt();
                dataLelang.setIdPenawar(idnawar);
                System.out.println("Masukkan Id Barang");
                int idbarang = scanner.nextInt();
                dataLelang.setIdBarang(idbarang);
                System.out.println("Masukkan Harga Tawaran Anda");
                int hrgallg = scanner.nextInt();
                dataLelang.setIdBarang(hrgallg);

                System.out.println("=== Opsi Petugas STOP");
                boolean control = scanner.nextBoolean();
                dataPetugas.setStatus(control);

                if (control == true) {
                    String namaMasyarakat = dataMasyarakat.getnama();
                    String alamatMasyarakat = dataMasyarakat.getalamat();
                    String teleponMasyarakat = dataMasyarakat.gettelepon();
                    System.out.println("Data Masyarakat:");
                    System.out.println("Nama: " + namaMasyarakat);
                    System.out.println("Alamat: " + alamatMasyarakat);
                    System.out.println("Telepon: " + teleponMasyarakat);
                    System.out.println("===================================");
                    String namaPetugass = dataPetugas.getnama();
                    String alamatPetugass = dataPetugas.getalamat();
                    String teleponPetugass = dataPetugas.gettelepon();
                    System.out.println("Data Petugas:");
                    System.out.println("Nama: " + namaPetugass);
                    System.out.println("Alamat: " + alamatPetugass);
                    System.out.println("Telepon: " + teleponPetugass);
                    System.out.println("===================================");
                    System.out.println("Data Barang final:");
                    System.out.println("ID Pelelang: " + dataLelang.getIdPenawar());;
                    System.out.println("Nama Barang: " + dataBarang.getNamaBarang());
                    System.out.println("Harga Awal: " + dataBarang.getHargaAwal());
                    System.out.println("Harga Akhir: " + dataLelang.getHargaTertinggi());
                    System.out.println("Status: " + dataBarang.getStatus());
                }
            }


        } else {
            System.out.println("BARANG TIDAK DI LELANG :v");
        }


    }
}
