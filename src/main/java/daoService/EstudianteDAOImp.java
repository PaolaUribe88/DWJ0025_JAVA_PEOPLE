package daoService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import modelo.Estudiante;

public class EstudianteDAOImp implements EstudianteDAO {

	@Override
	public List<Estudiante> findAllEstudiante() throws SQLException, NamingException {
		try (Connection conn = DbUtils.getConexion(); Statement declaracion = conn.createStatement();) {
			ResultSet rs = declaracion.executeQuery("SELECT * FROM estudiante");
			List<Estudiante> estudiantes = new ArrayList<>();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int rut = rs.getInt("rut");
				String digitoV = rs.getString("digito_V");
				String genero = rs.getString("genero");
				int telefono = rs.getInt("telefono");
				String curso = rs.getString("curso");

				Estudiante estudiante = new Estudiante(id, nombre, rut, digitoV, genero, telefono, curso);
				estudiantes.add(estudiante);
			}
			return estudiantes;
		}
	}

	@Override
	public Estudiante findEstudianteById(int estudianteId) throws SQLException, NamingException {
		try (Connection conexion = DbUtils.getConexion();
				PreparedStatement declaracion = conexion.prepareStatement("SELECT * FROM estudiante WHERE id = ?");) {
			declaracion.setInt(1, estudianteId);
			ResultSet rs = declaracion.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int rut = rs.getInt("rut");
				String digitoV = rs.getString("digito_v");
				String genero = rs.getString("genero");
				int telefono = rs.getInt("telefono");
				String curso = rs.getString("curso");
				return new Estudiante(id, nombre, rut, digitoV, genero, telefono, curso);

			} else {
				return null;
			}
		}
	}

	@Override
	public void crearEstudiante(Estudiante estudiante) throws SQLException, NamingException {
		try (Connection conn = DbUtils.getConexion();
				PreparedStatement decprep = conn.prepareStatement(
						"INSERT INTO estudiante(nombre ,rut ,digito_v , genero, telefono, curso) VALUES (?,?,?,?,?,?)");

		) {

			decprep.setString(1, estudiante.getNombre());
			decprep.setInt(2, estudiante.getRut());
			decprep.setString(3, estudiante.getDigitoV());
			decprep.setString(4, estudiante.getGenero());
			decprep.setInt(5, estudiante.getTelefono());
			decprep.setString(6, estudiante.getCurso());
			decprep.executeUpdate();
		}
	}

	@Override
	public void editarEstudiante(Estudiante estudiante) throws SQLException, NamingException {
		String sql = "UPDATE estudiante" + " SET nombre = ?, rut = ?, digito_v = ?, genero = ?, telefono = ?, curso = ?"
				+ " WHERE id = ?";
		try (Connection conexion = DbUtils.getConexion();
				PreparedStatement declaracion = conexion.prepareStatement(sql);) {
			declaracion.setString(1, estudiante.getNombre());
			declaracion.setInt(2, estudiante.getRut());
			declaracion.setString(3, estudiante.getDigitoV());
			declaracion.setString(4, estudiante.getGenero());
			declaracion.setInt(5, estudiante.getTelefono());
			declaracion.setString(6, estudiante.getCurso());
			declaracion.executeUpdate();
		}
	}

	@Override
	public void eliminarEstudiante(int estudianteId) throws SQLException, NamingException {
		try (Connection conexion = DbUtils.getConexion();
				PreparedStatement declaracion = conexion.prepareStatement("DELETE FROM estudiante WHERE id = ?");) {
			declaracion.setInt(1, estudianteId);
			int filaEliminada = declaracion.executeUpdate();
		}

	}

	@Override
	public Estudiante findLastCreatedEstudiante() throws SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

}
