package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import daoService.AsignaturaDAO;
import daoService.CalificacionDAO;
import daoService.EstudianteDAO;

public class CalificacionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EstudianteDAO estudianteDAO;
	private AsignaturaDAO asignaturaDAO;
	private CalificacionDAO calificacionDAO;

    public CalificacionController() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

}
}