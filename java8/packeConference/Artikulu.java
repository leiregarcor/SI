import java.util.ArrayList;
import java.util.List;

public class Artikulu {
    private String izenburu;
    private String fitxategi;
    private List<String> alorKol = new ArrayList<String>();
    private List<Egile> egileKol = new ArrayList<Egile>();

    public Artikulu(String izenburu, String fitxategi) {
        this.izenburu = izenburu;
        this.fitxategi = fitxategi;
    }

    public int getAlorKop() {
        return alorKol.size();
    }

    public boolean hainbatEgileDitu() {
        return egileKol.size()>1;
    }

    public int zenbNazionalitateak(){

    }
}
