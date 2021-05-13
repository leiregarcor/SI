import java.util.ArrayList;
import java.util.List;

public class JasotakoArtikuluak {

    private static JasotakoArtikuluak nJA = new JasotakoArtikuluak();
    private List<Artikulu> artikuluKol = new ArrayList<Artikulu>();

    private JasotakoArtikuluak(){};

    public static JasotakoArtikuluak getJA()
    {
        return nJA;
    }
}
