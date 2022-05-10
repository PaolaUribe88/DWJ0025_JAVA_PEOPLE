package daoService;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import modelo.Calificacion;

public interface CalificacionDAO {
	
	public List<Calificacion> findAllCalificacion ()throws SQLException, NamingException;
	public Calificacion findCalificacionById()throws SQLException, NamingException;
	public void crearCalificacion ()throws SQLException, NamingException;
	public void editarCalificacion () throws SQLException, NamingException;
	public void eliminarCalificacion () throws SQLException, NamingException;

}
