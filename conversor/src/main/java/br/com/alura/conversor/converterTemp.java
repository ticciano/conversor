package br.com.alura.conversor;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class converterTemp
 */
@WebServlet(name = "ConverterTemp", urlPatterns = { "/converterTemp" })
public class converterTemp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stringTemp = request.getParameter("tempCelsius");
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		double celsius,fahrenheit;
		
		celsius = Integer.parseInt(stringTemp);
		fahrenheit = (celsius*1.8)+32;
		numberFormat.format(fahrenheit);
		
		
		//chamar JSP
    RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
    request.setAttribute("result", String.valueOf(fahrenheit));
    request.setAttribute("celsius", String.valueOf(celsius));
    rd.forward(request, response);
	}

}
