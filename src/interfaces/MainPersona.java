package interfaces;

public class MainPersona {
	
public static void main(String[] args) {
		
		//Se crea Profesor
		Persona p = new Profesor("José", 1987, 1200.0);
		System.out.println(p.toString());
		System.out.println("Se le aplica un descuento de " + p.calculaDescuento(300) + " %" + " a la cantidad de " + p.getCantidad() + " €");
		
		
		//Se crea Alumno
		Persona a = new Alumno("Pedro", 2005, "cuarto");
		System.out.println(a.toString());
		System.out.println("Se le aplica un descuento de " + a.calculaDescuento(100) + " %" + " a la cantidad de " + a.getCantidad() + " €");
	}

}
