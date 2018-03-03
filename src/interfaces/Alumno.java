package interfaces;

public class Alumno extends Persona {
	
	private String curso;
	private double porcentaje = 10;
	private double cantidad;
	
	//Contructores
	public Alumno() {
		super("",2000);
		this.curso = "";
	}
	
	public Alumno(String nombre, int anyoNacimiento, String curso) {
		super(nombre, anyoNacimiento);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "El alumno " + getNombre() + " nacido en el " + getAnyoNacimiento() + " pertenece al " + getCurso() + " curso";
	}
	
	public double calculaDescuento(double cantidad) {
		setCantidad(cantidad);
		return porcentaje;
	}
		
}
