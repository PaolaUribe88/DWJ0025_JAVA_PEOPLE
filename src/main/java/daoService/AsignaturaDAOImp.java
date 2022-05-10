package daoService;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
				int id			= rs.getInt("id");
				String nombreAsignatura	= rs.getString("nombre");
				
				Asignatura asignatura = new Asignatura(id,nombreAsignatura);
				asignaturas.add(asignatura);
				
			}
			return asignaturas;
		}
	}

	@Override
	public Asignatura findAsignaturaById(int asignaturaId) throws SQLException, NamingException {
		try (
				Connection conexion = DbUtils.getConexion();
				PreparedStatement declaracion = conexion.prepareStatement("SELECT * FROM asignatura WHERE id = ?");
			) {
				declaracion.setInt(1, asignaturaId);
		
				ResultSet rs = declaracion.executeQuery();
				if(rs.next()) {
					int id = rs.getInt("id");
					String nombre = rs.getString("nombre");
					return new Asignatura(id, nombre);
				}else {
					return null;
				}
		}	
	}

	@Override
	public void crearAsignatura(Asignatura asignatura) throws SQLException, NamingException {
		try (Connection conn = DbUtils.getConexion();
				PreparedStatement decprep = conn.prepareStatement(
						"INSERT INTO asignatura(id ,nombre) VALUES (?,?)");

		) {

			decprep.setString(1, asignatura.getNombreAsignatura());
			decprep.executeUpdate();
			}
	}

	@Override
	public void editarAsigantura(Asignatura asignatura) throws SQLException, NamingException {
		String sql = "UPDATE asignatura" + " SET nombre = ?"
				+ " WHERE id = ?";
		try (Connection conexion = DbUtils.getConexion();
				PreparedStatement declaracion = conexion.prepareStatement(sql);) {
			declaracion.setString(1, asignatura.getNombreAsignatura() );
			declaracion.executeUpdate();
		}
	}

	@Override
	public void eliminarAsignatura(int asignaturaId) throws SQLException, NamingException {
		try (Connection conexion = DbUtils.getConexion();
				PreparedStatement declaracion = conexion.prepareStatement("DELETE FROM nombre WHERE id = ?");) {
			declaracion.setInt(1, asignaturaId);
			int filaEliminada = declaracion.executeUpdate();
		}
	}

	@Override
	public Asignatura findLastCreatedAsignatura() throws SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

}
