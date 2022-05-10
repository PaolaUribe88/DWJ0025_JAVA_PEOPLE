package daoService;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import modelo.Asignatura;

public interface AsignaturaDAO {

	public List<Asignatura> findAllAsignatura()throws SQLException, NamingException;
	public Asignatura findAsignaturaById()throws SQLException, NamingException;
	public void crearAsignatura () throws SQLException, NamingException;
	public void editarAsigantura ()throws SQLException, NamingException;
	public void eliminarAsignatura() throws SQLException, NamingException;
	public Asignatura findLastCreatedAsignatura()throws SQLException, NamingException;
}
