package modelo;

public class Estudiante {
	private int id;
	private String nombre;
	private int rut;
	private String digitoV;
	private String genero;
	private int telefono;
	
	//CONSTRUCTOR VACIO
	public Estudiante() {
		super();
	}
	//CONSTRUCTOR COMPLETO
	public Estudiante(int id, String nombre, int rut, String digitoV, String genero, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.digitoV = digitoV;
		this.genero = genero;
		this.telefono = telefono;
	}
	//GETTER AND SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getDigitoV() {
		return digitoV;
	}
	public void setDigitoV(String digitoV) {
		this.digitoV = digitoV;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
