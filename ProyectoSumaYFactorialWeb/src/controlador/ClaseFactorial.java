package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Servicio.SumaYFactorialServicioProxy;

/**
 * Servlet implementation class ClaseFactorial
 */
@WebServlet("/ClaseFactorial")
public class ClaseFactorial extends HttpServlet {
	SumaYFactorialServicioProxy obj = new SumaYFactorialServicioProxy();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClaseFactorial() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Guardamos en una variable "dato" el valor ingresado por el usuario
		int dato = Integer.parseInt(request.getParameter("dato3"));
		// Guardamos en una variable lo que retorna la funcion factorial que recibe el dato
		String resultado = "" + obj.factorial(dato);
		// Mostramos en el JSP la variable resultado
		request.setAttribute("mensaje", "El factorial es: "+ resultado );  
		request.getRequestDispatcher("/index.jsp").forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
