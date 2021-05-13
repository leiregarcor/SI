import java.util.ArrayList;
import java.util.List;

public class ErrebisoreAutomatikoKatalogoa {
    private static ErrebisoreAutomatikoKatalogoa nRAK = new ErrebisoreAutomatikoKatalogoa();
    private List<ErrebisoreAutomatiko> artikuluKol = new ArrayList<ErrebisoreAutomatiko>();

    private ErrebisoreAutomatikoKatalogoa(){};

    public static ErrebisoreAutomatikoKatalogoa getnRAK()
    {
        return nRAK;
    }
}
