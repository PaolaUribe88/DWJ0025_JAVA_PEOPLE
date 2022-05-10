package daoService;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import modelo.Asignatura;

public interface AsignaturaDAO {

	public List<Asignatura> findAllAsignatura()throws SQLException, NamingException;
	public Asignatura findAsignaturaById(int Id)throws SQLException, NamingException;
	public void crearAsignatura (Asignatura asignatura) throws SQLException, NamingException;
	public void editarAsigantura (Asignatura asignatura)throws SQLException, NamingException;
	public void eliminarAsignatura(int id) throws SQLException, NamingException;
	public Asignatura findLastCreatedAsignatura()throws SQLException, NamingException;
}
