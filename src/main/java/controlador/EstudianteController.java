package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Estudiante;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import daoService.AsignaturaDAO;
import daoService.CalificacionDAO;
import daoService.EstudianteDAO;
import daoService.EstudianteDAOImp;

public class EstudianteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EstudianteDAO estudianteDAO;
	private AsignaturaDAO asignaturaDAO;
	private CalificacionDAO calificacionDAO;
	
    public EstudianteController() {
    
    }
    
	@Override
	public void init() throws ServletException {
		super.init();
		this.estudianteDAO = new EstudianteDAOImp();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion") == null ? "" : request.getParameter("accion");
		String vistaJSP = "";
		switch (accion) {
		case "eliminar":
			try {
			int estudianteID = Integer.parseInt(request.getParameter("id"));
			estudianteDAO.eliminarEstudiante(estudianteID);
			response.sendRedirect("/JAVA-PEOPLE/EstudianteController?accion=listar");
		}catch(SQLException sql) {
			sql.printStackTrace();
			response.sendError(404);
		}catch(NamingException sql1) {
			sql1.printStackTrace();
			response.sendError(500);
		}
			break;
		case "modificar":
		try {
			int estuanteId = Integer.parseInt(request.getParameter("id"));
			Estudiante estudiante = estudianteDAO.findEstudianteById(estuanteId);
			request.setAttribute("estudiante", estudiante);
			vistaJSP ="WEB-INF/jsp/vista/estudiante/estudiante-form.jsp";
			request.getRequestDispatcher(vistaJSP).forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendError(404);
			
		} catch (NamingException e) {
			e.printStackTrace();
			response.sendError(500);
		}
		break;
		case "form":
			vistaJSP ="WEB-INF/jsp/vista/estudiante/estudiante-form.jsp";
			request.getRequestDispatcher(vistaJSP);
			try {
				
			} catch (SQLException | NamingException e) {
				e.printStackTrace();
				response.sendError(500);
				return;
			}
			request.getRequestDispatcher(vistaJSP).forward(request, response);
			break;
		case "listar":
			List<Estudiante> estudiantes = null;
			try {
				estudiantes = estudianteDAO.findAllEstudiante();
			} catch (SQLException | NamingException e) {
				e.printStackTrace();
				response.sendError(500);
				return;
			}
			request.setAttribute("estudiantes", estudiantes);
			request.getRequestDispatcher("/WEB-INF/jsp/vista/estudiante/estudiante-listar.jsp").forward(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
