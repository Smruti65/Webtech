package com.cutm;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class Login extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    String p=request.getParameter("userPass");  
          
    if(p.equals("1234"))
	{  
    	RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
    	rd.forward(request, response);  
	}  	
    else{  
        out.print("Sorry your UserName or Password invalid");  
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        rd.include(request, response);  
                      
        }  
    }  
  
}  