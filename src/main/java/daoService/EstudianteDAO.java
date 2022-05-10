package daoService;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import modelo.Estudiante;

public interface EstudianteDAO {
	
	public List<Estudiante> findAllEstudiante()throws SQLException, NamingException;
	public Estudiante findEstudianteById(int estudianteId)throws SQLException, NamingException;
	public void crearEstudiante (Estudiante estudiante)throws SQLException, NamingException;
	public void editarEstudiante (Estudiante estudiante)throws SQLException, NamingException;
	public void eliminarEstudiante(int id)throws SQLException, NamingException;
	public Estudiante findLastCreatedEstudiante()throws SQLException, NamingException;
	
}
