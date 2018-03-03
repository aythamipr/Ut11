package interfaces;

public class Profesor extends Persona {
	
	private double salario;
	private double porcentaje = 2;
	private double cantidad;
	
	//Contructores
	public Profesor() {
		super("",2000);
		this.salario = 0;
	}
		
	public Profesor(String nombre, int anyoNacimiento, double salario) {
		super(nombre, anyoNacimiento);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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
		return "El profesor " + getNombre() + " nacido en el " + getAnyoNacimiento() + " tiene un salario de " + getSalario() + " euros";
	}
	
	public double calculaDescuento(double cantidad) {
		setCantidad(cantidad);
		return porcentaje;
	}
}
