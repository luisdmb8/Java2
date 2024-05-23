package web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;


@WebServlet("/HolaMundo") // ruta donde se guardara
public class HolaMundo extends HttpServlet {
	
	// Metodo DoGet
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Hola Mundo desde Servlets");
	}

}
