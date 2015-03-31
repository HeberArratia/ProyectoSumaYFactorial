package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Servicio.SumaYFactorialServicioProxy;

/**
 * Servlet implementation class ClaseSuma
 */
@WebServlet("/ClaseSuma")
public class ClaseSuma extends HttpServlet {
	SumaYFactorialServicioProxy obj = new SumaYFactorialServicioProxy();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClaseSuma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Guardamos en variables de tipo entero los string que ingresa el usuario
		int dato1 = Integer.parseInt(request.getParameter("dato1"));
		int dato2 = Integer.parseInt(request.getParameter("dato2"));
		// Guardamos en una variable lo que retorna la funcion sumaNumeros
		String resultado = "" + obj.sumaNumeros(dato1, dato2);
		// Imprimimos la variable resultado en el JSP
		request.setAttribute("mensaje", "La suma es: "+ resultado );  
		request.getRequestDispatcher("/index.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
