package modelo;

public class Asignatura {
	private int id;
	private String nombreAsignatura;
	
	//CONSTRUCTOR VACIO
	public Asignatura() {
		
	}
	//CONSTRUCTOR COMPETO
	public Asignatura(int id, String nombreAsignatura) {
		
		this.id = id;
		this.nombreAsignatura = nombreAsignatura;
	}
	//GETTER AND SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	

}
