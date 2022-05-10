package daoService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import modelo.Asignatura;

public class AsignaturaDAOImp implements AsignaturaDAO {

	@Override
	public List<Asignatura> findAllAsignatura() throws SQLException, NamingException {
		try(
				Connection conn = DbUtils.getConexion();
				Statement st = conn.createStatement();
			) {
			ResultSet rs = st.executeQuery("SELECT * FROM asignatura");
			List<Asignatura> asignaturas = new ArrayList<>();
			while(rs.next()) {
				int id			= rs.getInt("asignatura_id");
				String nombre 	= rs.getString("nombre");
				
				Asignatura asignatura = new Asignatura(id,nombre);
				asignaturas.add(asignatura);
				
			}
			return asignaturas;
		}
	}

	@Override
	public Asignatura findAsignaturaById() throws SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearAsignatura() throws SQLException, NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarAsigantura() throws SQLException, NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarAsignatura() throws SQLException, NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Asignatura findLastCreatedAsignatura() throws SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

}
