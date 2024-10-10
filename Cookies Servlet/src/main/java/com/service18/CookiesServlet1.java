package com.service18;


import java.io.*;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  
  
  
  
public class CookiesServlet1 extends HttpServlet {  
  
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    out.print(" <h1>Hello "+ n +" Welcome "+" to SISTec");  
  
    Cookie ck=new Cookie("uname",n);
    response.addCookie(ck);
  
  
    out.print("<form action='servlet2'>");  
    
    out.print("<input type='submit' value='Go to servlet 2'><br/> ");  
    out.print("</form>");  
          
    out.close();  
  
        }catch(Exception e){System.out.println(e);}  
  }  
}  