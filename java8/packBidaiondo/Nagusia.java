import java.util.Map;

public class Nagusia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estazio e1 = new Estazio("a", 1);
		Estazio e2 = new Estazio("b", 2);
		Estazio e3 = new Estazio("c", 3);
		Estazio e4 = new Estazio("d", 4);
				
				Oferta o1 = new Oferta("a", "d");
				o1.addEstazio(e1);
				o1.addEstazio(e2);
				o1.addEstazio(e3);
				o1.addEstazio(e4);
				
				Oferta o2 = new Oferta("b", "d");
				o2.addEstazio(e1);
				o2.addEstazio(e4);
				
				Oferta o3 = new Oferta("a", "b");
				o3.addEstazio(e1);
				o3.addEstazio(e2);
				
				OfertaKatalogoa ok = OfertaKatalogoa.getOK();
				ok.addOferta(o2);
				ok.addOferta(o1);
				ok.addOferta(o3);
				
		//ARIKETAK

	}

}
