import java.util.*;

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
	public void printHelburuPosibleak(String pJat){
		ofertakol.stream()
				.filter(p->p.jatorriaDa(pJat))
				.forEach(p -> System.out.println(p.getHelburu()));
		/**
		 ofertakol.stream()
		 .filter(p->p.jatorriaDa(pJat)) //1- pJat jatorritik filtratu
		 .map(Oferta::getHelburu)		//2- Filtratutako oferten helburuak "stream"ean sartu
		 .forEach( System.out::println); //3- Pantailaratu

		 * */

	}
	
	//2 ariketa
	public void printHelburuPosibleak2(String pOrigen){
		ofertakol.stream()
				.filter(p->p.jatorriaDa(pOrigen))
				.map(Oferta::getHelburu)
				.distinct()
				.forEach(p -> System.out.println(p));
	}

	//3 ariketa
	public List<Oferta> getJatorrizOrdenatutakoOfertak(){
		return ofertakol.stream()
				.sorted(comparing(Oferta::getJatorri)) //1- ofertak jatorriz ordenatu
				.collect(toList());					   //2- zerrenda batean sartu
	}

	//4 ariketa
	public List<Oferta> getJatorrizHelburuzOrdenatutakoOfertak(){
		return ofertakol.stream()
				.sorted(Comparator.comparing(Oferta::getJatorri)
							.thenComparing(Oferta::getHelburu))
				.collect(toList());
	}



	//5 ariketa	
	public List<Oferta> getEstaziodunOfertak(String pHiri){
		return ofertakol.stream()
				.filter(p->p.estazioaDu(pHiri))
				.collect(toList());
	}
	
	//6 ariketa
	public void printOfertakJatorriHelburu(String pJat, String pHel){
		ofertakol.stream()
				.filter(p -> p.jatorriaHelburuaDa(pJat, pHel))
				.sorted(comparing(Oferta::kalkKostu))
				.forEach(System.out::println);
	}
	
	//7 ariketa
	public Map<String,Oferta> getOfertaMinEstazioJatorri(){
		return ofertakol.stream()
				.collect(groupingBy(Oferta::getJatorri,
						collectingAndThen(minBy(comparing(Oferta::estazioakKontatu)),
								p->p.get()
								)
						)
				);
	}
	
	//8 ariketa
	public Map<String,Integer> getMinEstazioJatorri(){
		return ofertakol.stream()
				.collect(groupingBy(Oferta::getJatorri,
						collectingAndThen(minBy(comparing(Oferta::estazioakKontatu)),
								p->p.get().estazioakKontatu()
						)
						)
				);
	}


}
