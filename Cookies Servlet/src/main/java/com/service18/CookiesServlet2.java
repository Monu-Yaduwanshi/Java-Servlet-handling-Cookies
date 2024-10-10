package com.service18;

import java.io.*;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookiesServlet2 extends HttpServlet {  

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
    	
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie ck[] = request.getCookies();
            if (ck != null) {
                out.print("<h1>Hello Welcome Back " + ck[0].getValue());
                out.print("<h1>Thank You!!! " );
                out.println("<a href='NewFile.html'><br>Home Page</b></a>");
            } else {
                out.print("<h1>You are new user,go to home page again!!!");
                out.println("<a href='NewFile.html'><br>Home Page</b></a>");

            }

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }
}
