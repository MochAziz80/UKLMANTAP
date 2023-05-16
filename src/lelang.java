import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class lelang {
    private ArrayList<Integer> idPenawar = new ArrayList<>();
    private ArrayList<Integer> idBarang = new ArrayList<>();
    private  ArrayList<Integer> hargaTawar = new ArrayList<>();

    public void setIdPenawar(int idPenawar) {
        this.idPenawar.add(idPenawar);
    }

    public void setIdBarang(int idBarang) {
        this.idBarang.add(idBarang);
    }

    public void setHargaTawar(int idPenawar, int hargaTawar) {
        this.idPenawar.add(idPenawar);
        this.hargaTawar.add(hargaTawar);
    }

    public int getIdPenawar() {
        return idPenawar.get(0);
    }
    public int getIdBarang() {
        return idBarang.get(0);
    }
    public int getHargaTawar() {
        return idBarang.get(0);
    }

    public int getHargaTertinggi() {
        int hargaTertinggi = getHargaTertinggi();
        int index = hargaTawar.indexOf(hargaTertinggi);
        return idPenawar.get(index);
    }
}
