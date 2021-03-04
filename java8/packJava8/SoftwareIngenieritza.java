package packJava8;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.*;
import java.util.stream.DoubleStream;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;
import java.util.Iterator;
import java.util.List;


public class SoftwareIngenieritza {
	
	private static SoftwareIngenieritza nSoftwareIngenieritza;
	private List<Ikasle> matrikulatuZerr = new ArrayList<>();

	private SoftwareIngenieritza(){}
	
	public static SoftwareIngenieritza getSoftwareIngenieritza(){
		if(nSoftwareIngenieritza==null){
			nSoftwareIngenieritza = new SoftwareIngenieritza();
		}
		return nSoftwareIngenieritza;
	}
	
	public void addIkasle(Ikasle pIk){
		matrikulatuZerr.add(pIk);
	}
	
	private Iterator<Ikasle> getIterator(){
		return matrikulatuZerr.iterator();
	}	
	
	////////////////////////////JAVA8////////////////////////////////
	//5.
	public void notaTotalakErakutsi(){
		//forEach() amaierako operazioak fluxuko elementu bakoitza kontsumitzen du, definitutako lambda aplikatuz.
		matrikulatuZerr.stream()
				.mapToDouble(Ikasle::notaFinalaKalkulatu)
				.forEach(p -> System.out.println(p));
	}

	//6.
	public List<Ikasle> gainditutakoakLortu(){
		// bitarteko operazioa
			//filter(predikatua) filtroa da, predikatua betetzen duten elementuen fluxua bueltatu. Stream<T> bueltatzen du.
		// amaierako operazioa:
			//collect(toList()) zerrenda batean multzokatu, fluxua erreduzitu zerrenda mapa edo balio oso bat sortzeko, definitutako rekolekzio metodoaren arabera
			//toList() fluxu bateko elementuak biltzen dituen kolektorea bueltatu. int bueltatzen du
		return matrikulatuZerr.stream()
				.filter(Ikasle::gaindituDu)
				.collect(toList());
	}

	//7
	public List<Ikasle> gainditutakoakIzenezOrdenatutaLortu(){
		// bitarteko operazioa
		//sorted(Comparator<T>) fluxu bateko elementuak baldintza batzuen arabera ordenatu eta emaitza fluxu berri batean bueltatu
		return gainditutakoakLortu().stream()
				.sorted(comparing(Ikasle::getIzen))
				.collect(toList());
	}

	//8.
	public List<Ikasle> gainditutakoakIzenezAbizenezOrdenatutaLortu(){
		return gainditutakoakLortu().stream()
				.sorted(comparing(Ikasle::getIzen).thenComparing(Ikasle::getAbizen))
				.collect(toList());
	}

	//9.
	public double gaindituenPortzentaiaLortu(){
		//long Fluxuko elementu kopurua bueltatu.
		return (double) gainditutakoakLortu().stream()
				.count() / (long) matrikulatuZerr.size() *100;
	}

	//10.
	public List<String> herrialdeakLortu(){
		//distinct biatrtekoa fluxu berria bueltatu, errepikatu gabeko elementuez osatutakoa
		return matrikulatuZerr.stream()
				.map(Ikasle::getHerrialde)
				.distinct()
				.collect(toList());

	}
	
	//11.
	public List<Ikasle> entregagarriGuztiakGainditutakoakLortu(){
		return matrikulatuZerr.stream()
		.filter(Ikasle::entregagarriGuztiakGaindituDitu)
		.collect(toList());
	}

	//12.
	public List<Ikasle> entregagarrianNotaGainditzenDutenIkasleakLortu(double pNota){
		return matrikulatuZerr.stream()
				.filter(p-> p.entregagarrietakoBatekNotaGaindituDu(pNota))
				.collect(toList());
	}

	//13.
	public void ikasleenEstatiskikakInprimatu() {
		DoubleSummaryStatistics stats = matrikulatuZerr.stream()
				.mapToDouble(Ikasle::notaFinalaKalkulatu)
				.summaryStatistics();
		System.out.println("Maximoa= "+stats.getMax() +"  Minimoa= "+ stats.getMin() + "  Batazbestekoa= " + stats.getAverage());

	}

	//14.
	public Map<Boolean,List<Ikasle>> gaindituakSuspendituakLortu(){
		//partitioningBy Predikatu baten arabera, elementuak (erredukzioa aplikatuz) biltzen dituen kolektorea bueltatu.
		return matrikulatuZerr.stream()
				.collect(partitioningBy(Ikasle::gaindituDu));
	}

	//15
	public Map<String,List<Ikasle>> ikasleakHerrialdekaLortu(){
		// groupingBy Sailkapen baten arabera, elementuak (erredukzioa aplikatuz) biltzen dituen kolektorea bueltatu.
		return matrikulatuZerr.stream()
				.collect(groupingBy(Ikasle::getHerrialde));
	}
	//16
	public Map<String,Double> batazbestekoNotakHerrialdekaLortu(){
		return matrikulatuZerr.stream()
				.collect(
						groupingBy(Ikasle::getHerrialde,
								averagingDouble(Ikasle::notaFinalaKalkulatu)));
	}

	//17.
	public Map<String,Ikasle> notaMaximodunIkasleaHerrialdekaLortu(){
		return matrikulatuZerr.stream()
				.collect(
						groupingBy(Ikasle::getHerrialde,
								collectingAndThen(maxBy(Comparator.comparingDouble(Ikasle::notaFinalaKalkulatu)),Optional::get)));
	}


	//18.
	public Map<String,Double> notaMaximoaHerrialdekaLortu(){
		return matrikulatuZerr.stream()
				.collect(
						groupingBy(Ikasle::getHerrialde,
								collectingAndThen(maxBy(Comparator.comparingDouble(Ikasle::notaFinalaKalkulatu)),
										p->p.isPresent()?p.get().notaFinalaKalkulatu() : new Double(0.0))));
	}

}
