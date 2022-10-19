package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

public class ServletWithHttp extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        System.out.println("This is get method........");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>This is Get method of my servlet</h1>");
        
    }
}