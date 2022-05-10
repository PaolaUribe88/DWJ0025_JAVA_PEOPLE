package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;

import daoService.AsignaturaDAO;
import daoService.CalificacionDAO;
import daoService.EstudianteDAO;

public class EstudianteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EstudianteDAO estudianteDAO;
	private AsignaturaDAO asignaturaDAO;
	private CalificacionDAO calificacionDAO;
	
    public EstudianteController() {
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion") == null ? "" : request.getParameter("accion");
		String vistaJSP = "";
		switch (accion) {
		case "eliminar":
			try {
			int estudianteID = Integer.parseInt(request.getParameter("id"));
			EstudianteDAO.eliminarEstudiante(estudianteID);
			response.sendRedirect("/JAVA-PEOPLE/EstudianteController?accion=listar");
		}catch(SQLException sql) {
			sql.printStackTrace();
			response.sendError(404);
		}catch(NamingException sql1) {
			sql1.printStackTrace();
			response.sendError(500);
		}
			break;
		case "modificar";	
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
