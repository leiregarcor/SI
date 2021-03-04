package packJava8;

import java.util.List;
import java.util.Map;

public class Nagusia {

	public static void main(String[] args) {
		/////////// 1. ikaslea
		Entregagarri e11 = new Entregagarri("Entregagarri1");
		e11.setUrl("Erantzuna 1");
		e11.setNota(5.4);
		
		Entregagarri e12 = new Entregagarri("Entregagarri2");
		e12.setUrl("Erantzuna 2");
		e12.setNota(6.8);
		
		Entregagarri e13 = new Entregagarri("Entregagarri3");
		e13.setUrl("Erantzuna 3");
		e13.setNota(4.6);
		
		Ikasle a1 = new Ikasle("Markel", "Alberdi" , "markel@ehu.eus", "Espainia");
		a1.setNota(2.5);
		a1.addEntregagarri(e11);
		a1.addEntregagarri(e12);
		a1.addEntregagarri(e13);

		/////////// 2. ikaslea	
		Entregagarri e21 = new Entregagarri("Entregagarri1");
		e21.setUrl("Erantzuna 1");
		e21.setNota(6.0);
		
		Entregagarri e22 = new Entregagarri("Entregagarri2");
		e22.setUrl("Erantzuna 2");
		e22.setNota(9.3);
		
		Entregagarri e23 = new Entregagarri("Entregagarri3");
		e23.setUrl("Erantzuna 3");
		e23.setNota(5.6);
		
		Ikasle a2 = new Ikasle("Maria", "Vaquero", "maria@ehu.eus", "Espainia");
		a2.setNota(5.5);
		a2.addEntregagarri(e21);
		a2.addEntregagarri(e22);
		a2.addEntregagarri(e23);

		/////////// 3. ikaslea
		Entregagarri e31 = new Entregagarri("Entregagarri1");
		e31.setUrl("Erantzuna 1");
		e31.setNota(4.0);
		
		Entregagarri e32 = new Entregagarri("Entregagarri2");
		e32.setUrl("Erantzuna 2");
		e32.setNota(5.3);
		
		Entregagarri e33 = new Entregagarri("Entregagarri3");
		e33.setUrl("Erantzuna 3");
		e33.setNota(5.6);
		
		Ikasle a3 = new Ikasle("Garazi", "Bikandi", "garazi@ehu.eus", "Espainia");
		a3.setNota(3.5);
		a3.addEntregagarri(e31);
		a3.addEntregagarri(e32);
		a3.addEntregagarri(e33);

		/////////// 4. ikaslea
		Entregagarri e41 = new Entregagarri("Entregagarri1");
		e41.setUrl("Erantzuna 1");
		e41.setNota(7.0);
		
		Entregagarri e42 = new Entregagarri("Entregagarri2");
		e42.setUrl("Erantzuna 2");
		e42.setNota(5.3);
		
		Entregagarri e43 = new Entregagarri("Entregagarri3");
		e43.setUrl("Erantzuna 3");
		e43.setNota(5.6);
		
		Ikasle a4 = new Ikasle("Pedro", "Aragon", "pedro@ehu.eus", "Francia");
		a4.setNota(7.5);
		a4.addEntregagarri(e41);
		a4.addEntregagarri(e42);
		a4.addEntregagarri(e43);

		/////////// 5. ikaslea
		Entregagarri e51 = new Entregagarri("Entregagarri1");
		e51.setUrl("Erantzuna 1");
		e51.setNota(7.0);
		
		Entregagarri e52 = new Entregagarri("Entregagarri2");
		e52.setUrl("Erantzuna 2");
		e52.setNota(8.3);
		
		Entregagarri e53 = new Entregagarri("Entregagarri3");
		e53.setUrl("Erantzuna 3");
		e53.setNota(2.6);
		
		Ikasle a5 = new Ikasle("Angel", "Alonso", "angel@ehu.eus", "Portugal");
		a5.setNota(6.8);
		a5.addEntregagarri(e51);
		a5.addEntregagarri(e52);
		a5.addEntregagarri(e53);

		/////////// 6. ikaslea
		Entregagarri e61 = new Entregagarri("Entregagarri1");
		e61.setUrl("Erantzuna 1");
		e61.setNota(7.0);
		
		Entregagarri e62 = new Entregagarri("Entregagarri2");
		e62.setUrl("Erantzuna 2");
		e62.setNota(5.3);
		
		Entregagarri e63 = new Entregagarri("Entregagarri3");
		e63.setUrl("Erantzuna 3");
		e63.setNota(2.6);
		
		Ikasle a6 = new Ikasle("Irati", "Alberdi", "irati@ehu.eus", "Portugal");
		a6.setNota(3.7);
		a6.addEntregagarri(e61);
		a6.addEntregagarri(e62);
		a6.addEntregagarri(e63);
		////////////////////////////////		
		/////////// IKASGAIA ///////////
		////////////////////////////////
		SoftwareIngenieritza nSI = SoftwareIngenieritza.getSoftwareIngenieritza();
		nSI.addIkasle(a1);
		nSI.addIkasle(a2);
		nSI.addIkasle(a3);
		nSI.addIkasle(a4);
		nSI.addIkasle(a5);
		nSI.addIkasle(a6);
		

		////////////JAVA8///////////
		
		/*******
		//Zerrenda normala dugunean
		nZ.forEach(System.out::println)
		//MAP dugunean
		mapZ.forEach((key,value) -> System.out.println("key "+key+", value "+ value));
		*******************/

		System.out.println(" ");
		//1.
		System.out.println("Entregagarrien nota= "+	a1.entregagarrienNotaKalkulatu());
		//2.
		System.out.println("Nota finala " + a1.notaFinalaKalkulatu());
		//3.
		System.out.println("Entregagari guzttiak gainditu ditu? "+a1.entregagarriGuztiakGaindituDitu());
		//4.
		double nota= 6;
		System.out.println("Entregagarrietako batek " +nota+ " "+" nota gainditu du? "+ a1.entregagarrietakoBatekNotaGaindituDu(6));

		System.out.println(" ");
		//5.
		nSI.notaTotalakErakutsi();
		//6.
		List<Ikasle> lista = nSI.gainditutakoakLortu();
		lista.forEach(System.out::println);
		System.out.println(" ");
		//7.
		lista = nSI.gainditutakoakIzenezOrdenatutaLortu();
		lista.forEach(System.out::println);
		System.out.println(" ");
		//8.
		lista = nSI.gainditutakoakIzenezAbizenezOrdenatutaLortu();
		lista.forEach(System.out::println);
		System.out.println(" ");
		//9.
		System.out.println("Gainditakoen portzentaia "+ nSI.gaindituenPortzentaiaLortu());
		//10.
		List<String> list = nSI.herrialdeakLortu();
		list.forEach(System.out::println);
		System.out.println(" ");
		//11.
		lista = nSI.entregagarriGuztiakGainditutakoakLortu();
		lista.forEach(System.out::println);
		System.out.println(" ");
		//12
		lista = nSI.entregagarrianNotaGainditzenDutenIkasleakLortu( nota);
		lista.forEach(System.out::println);
		System.out.println(" ");
		//13.
		nSI.ikasleenEstatiskikakInprimatu();
		//14.
		Map<Boolean,List<Ikasle>> map= nSI.gaindituakSuspendituakLortu();
		map.forEach((key,value) -> System.out.println("key "+key+", value "+ value));
		System.out.println(" ");
		//15.
		Map<String,List<Ikasle>> mapa = nSI.ikasleakHerrialdekaLortu();
		mapa.forEach((key,value) -> System.out.println("key "+key+", value "+ value));
		System.out.println(" ");
		//16.
		Map<String,Double> m = nSI.batazbestekoNotakHerrialdekaLortu();
		m.forEach((key,value) -> System.out.println("key "+key+", value "+ value));
		System.out.println(" ");
		//17.
		Map<String,Ikasle> ma = nSI.notaMaximodunIkasleaHerrialdekaLortu();
		ma.forEach((key,value) -> System.out.println("key "+key+", value "+ value));
		System.out.println(" ");
		//18.
		Map<String,Double> maa= nSI.notaMaximoaHerrialdekaLortu();
		maa.forEach((key,value) -> System.out.println("key "+key+", value "+ value));
		System.out.println(" ");
		
		System.out.println(" AMAITUTA ");



	}

}
