package packJava8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;


public class Ikasle {

	private String izen;
	private String abizen;
	private String eposta;
	private double azterketaNota;
	private String herrialde;
	private List<Entregagarri> entregagarriZerr = new ArrayList<Entregagarri>() ;

	public Ikasle(String pIzen, String pAbizen, String pEposta,  String pHerrialde)
	{
		izen = pIzen;
		abizen = pAbizen;
		eposta = pEposta;
		herrialde = pHerrialde;

	}
	/////GETTERRAK//////

	public String getIzen(){return izen;}
	public String getAbizen(){return abizen;}
	public String getHerrialde(){return herrialde;}

	///////////////////

	public void addEntregagarri(Entregagarri pEnt){
		entregagarriZerr.add(pEnt);
	}

	public void setNota(double pNota) {
		azterketaNota = pNota;
	}

	public String toString(){
		return "Izen-abizenak: " + izen + " " + abizen + ", eposta: " + eposta;
	}

	////////////////////////////JAVA8////////////////////////////////

	public boolean gaindituDu() {
		return notaFinalaKalkulatu() >= 5.0;
	}

	//1.
	public double entregagarrienNotaKalkulatu(){
		//stream() barne iterazioa, datu fluxu sekuentzia
		//bitarteko operazioak:
			//.mapToDouble(Entregagarri::getNota) mapaketa, buelta Stream<R>, Fluxuko elementu bakoitzari funtzio bat aplikatu, eta emaitza fluxu berri batean bueltatu.
		//amaierako operazioak:
			//average bueltatzen du OptionalDouble (fluxuko elementuen bb)
		//optional<T>: Fluxuko elementu bakoitzari funtzio bat aplikatu, eta emaitza fluxu berri batean bueltatu.
			//-hutsik dagoen jakiteko: isPresent
			//– balioa eskatzeko: get
			//– defektuzko balioa hutsik badago: orElse
		return entregagarriZerr.stream()
				.mapToDouble(Entregagarri::getNota)
				.average()
				.orElse(0.0);
	}

	//2.
	public double notaFinalaKalkulatu(){
		return (entregagarrienNotaKalkulatu()*0.4)+(azterketaNota*0.6);
	}

	//3.
	public boolean entregagarriGuztiakGaindituDitu(){
		return entregagarriZerr.stream()
				.allMatch(p-> p.getNota()>= 5.0);
	}


	//4.
	public boolean entregagarrietakoBatekNotaGaindituDu(double pNota){
		return entregagarriZerr.stream()
				.anyMatch(p->p.getNota()>pNota);
	}


}
