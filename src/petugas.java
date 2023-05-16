import java.util.ArrayList;

public class petugas extends barang implements gajelas {

    private ArrayList<String> namaPetugas = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();

    private int jmpenawar;

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setJmpenawar(int jmpenawar) {
        this.jmpenawar = jmpenawar;
    }

    public int getJmpenawar() {
        return jmpenawar;
    }

    @Override
    public void setnama(String nama) {
        namaPetugas.add(nama);
    }
    @Override
    public void setalamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void settelepon(String telepon) {
        this.telepon.add(telepon);
    }
    @Override
    public String getnama() {
        return namaPetugas.get(0);
    }

    @Override
    public String getalamat() {
        return alamat.get(0);
    }

    @Override
    public String gettelepon() {
        return telepon.get(0);
    }
}
