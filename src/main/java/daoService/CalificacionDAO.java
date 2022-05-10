package daoService;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import modelo.Calificacion;

public interface CalificacionDAO {
	
	public List<Calificacion> findAllCalificacion ()throws SQLException, NamingException;
	public Calificacion findCalificacionById(int numeroEvaluacionId)throws SQLException, NamingException;
	public void crearCalificacion (Calificacion calificacion)throws SQLException, NamingException;
	public void editarCalificacion (Calificacion calificacion) throws SQLException, NamingException;
	public void eliminarCalificacion (int numeroEvaluacionId) throws SQLException, NamingException;
	public Calificacion findLastCreatedCalificacion()throws SQLException, NamingException;
}
