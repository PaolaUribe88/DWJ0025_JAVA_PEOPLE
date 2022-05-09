package modelo;

public class Calificacion {
	private int numeroEvaluacion;
	private String nota;
	private Estudiante estudiante_id;
	private Asignatura asignatura_id;
	
	//CONSTRUCTOR VACIO
	public Calificacion() {
		super();
	}
	//CONSTRUCTOR COMPLETO
	public Calificacion(int numeroEvaluacion, String nota, Estudiante estudiante_id, Asignatura asignatura_id) {
		super();
		this.numeroEvaluacion = numeroEvaluacion;
		this.nota = nota;
		this.estudiante_id = estudiante_id;
		this.asignatura_id = asignatura_id;
	}
	//GETTER AND SETTER
	public int getNumeroEvaluacion() {
		return numeroEvaluacion;
	}
	public void setNumeroEvaluacion(int numeroEvaluacion) {
		this.numeroEvaluacion = numeroEvaluacion;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public Estudiante getEstudiante_id() {
		return estudiante_id;
	}
	public void setEstudiante_id(Estudiante estudiante_id) {
		this.estudiante_id = estudiante_id;
	}
	public Asignatura getAsignatura_id() {
		return asignatura_id;
	}
	public void setAsignatura_id(Asignatura asignatura_id) {
		this.asignatura_id = asignatura_id;
	}
	
}
