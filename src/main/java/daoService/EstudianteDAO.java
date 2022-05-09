package daoService;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import modelo.Estudiante;

public interface EstudianteDAO {
	
	public List<Estudiante> findAllEstudiante() throws SQLException, NamingException;
	public Estudiante findEstudianteById(int id) throws SQLException, NamingException;
	public void crearEstudiante () throws SQLException, NamingException;
	public void editarEstudiante ()throws SQLException, NamingException;
	public void eliminarEstudiante()throws SQLException, NamingException;
	
}
