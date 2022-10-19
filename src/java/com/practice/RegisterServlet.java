package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h2>welcome to resgister servlet</h2>");
        String name=request.getParameter("user_name");
        String email=request.getParameter("user_email");
        
        
        out.println("<h2>Name: "+name +"</h2>");
        out.println("<h2>Email: "+email +"</h2>");
        
        
    }
}
