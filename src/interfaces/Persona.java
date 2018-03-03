package interfaces;

public abstract class Persona {
	
	private String nombre;
	private int anyoNacimiento;
	
	//Contructores
	
	public Persona() {
		this.nombre = "";
		this.anyoNacimiento = 2000;
	}
	
	public Persona(String nombre, int anyoNacimiento) {
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}
	
	//Métodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", anyoNacimiento=" + anyoNacimiento;
	}
	
	public abstract double calculaDescuento(double cantidad);
	
	public abstract double getCantidad();
}
