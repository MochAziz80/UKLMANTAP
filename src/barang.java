import java.util.ArrayList;

public class barang{
    private ArrayList<Integer> idMasyarakat = new ArrayList<>();

    private ArrayList<String> namaBarang = new ArrayList<>();
    private ArrayList<Integer> hargaAwal = new ArrayList<>();
    private ArrayList<Boolean> status = new ArrayList<>();

    public void setIDMasyarakat(int id) {
        this.idMasyarakat.add(id);
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public void setHargaAwal(int harga) {
        this.hargaAwal.add(harga);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }


    public ArrayList<Integer> getIDMasyarakat() {
        return idMasyarakat;
    }

    public ArrayList<String> getNamaBarang() {
        return namaBarang;
    }

    public ArrayList<Integer> getHargaAwal() {
        return hargaAwal;
    }

    public ArrayList<Boolean> getStatus() {
        return status;
    }
}
