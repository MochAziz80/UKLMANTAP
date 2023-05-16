import java.util.ArrayList;
import java.util.Scanner;

public class masyarakat implements gajelas {
    private ArrayList<String> namaMasyarakat = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();

    @Override
    public void setnama(String nama) {
        this.namaMasyarakat.add(nama);
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
        return namaMasyarakat.get(0);
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
