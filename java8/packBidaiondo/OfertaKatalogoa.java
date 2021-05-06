import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class OfertaKatalogoa {

	private static OfertaKatalogoa nOK = new OfertaKatalogoa();
	private List<Oferta> ofertakol = new ArrayList<Oferta>();
	
	private OfertaKatalogoa(){};
	
	public static OfertaKatalogoa getOK()
	{
		return nOK;
	}
	
	
	public void addOferta(Oferta o)
	{
		ofertakol.add(o);
	}
	
	//1 ariketa
	public void printHelburuPosibleak(String pJat)
	{
		//TODO
	}
	
	//2 ariketa
	public void printHelburuPosibleak2(String pOrigen)
	{
		//TODO
	}
	
	//3 ariketa
	public List<Oferta> getJatorrizOrdenatutakoOfertak()
	{
		//TODO
	}
	
	//4 ariketa
	public List<Oferta> getJatorrizHelburuzOrdenatutakoOfertak()
	{
		//TODO
	}
	
	//5 ariketa	
	public List<Oferta> getEstaziodunOfertak(String pHiri)
	{
		//TODO
	}
	
	//6 ariketa
	public void printOfertakJatorriHelburu(String pJat, String pHel){
		//TODO
	}
	
	//7 ariketa
	public Map<String,Oferta> getOfertaMinEstazioJatorri()
	{
		//TODO
	}
	
	//8 ariketa
	public Map<String,Integer> getMinEstazioJatorri()
	{
		//TODO		
	}
}
