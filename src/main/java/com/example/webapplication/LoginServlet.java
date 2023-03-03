package com.example.webapplication;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static java.awt.SystemColor.info;


public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");

        PrintWriter out = response.getWriter();
        out.println("<html>\n");
        out.println("<h1>\n");
        out.println("Привет , " +"\n");
        out.println(name +"\n");
        out.println(surname +"\n");
        out.println("</h1>\n");


        out.println("</html>\n");

    }

}
