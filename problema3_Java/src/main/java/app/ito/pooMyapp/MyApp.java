package app.ito.pooMyapp;
import app.ito.poo.CuerpoCeleste;
import app.ito.poo.Ubicacion;
public class MyApp {
	
	static void run() {
		Ubicacion v = new Ubicacion();
		v.setLongitud(6588);
		v.setLatitud(8795);
		v.setPeriodo("Enero-Marzo");
		v.setDistancia(654847);
		
		System.out.println(new CuerpoCeleste("Apopis",null,"Desconocido"));
		
		System.out.println(new Ubicacion(574,46588,"Febrero-marzo",8798465));
	}
	public static void main (String [] args) {
		
		run();
	}
}
