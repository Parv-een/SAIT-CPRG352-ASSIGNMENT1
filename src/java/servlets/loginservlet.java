/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author parve
 */
public class loginservlet extends HttpServlet {
    String message="";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                   HttpSession session = request.getSession();
        
        String logout = request.getParameter("logout");
        if(logout!=null){
            session.invalidate();
            session = request.getSession();
            message="You have successfullhy logged out";
            request.setAttribute("message",message);
            
        }

        
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        return;
    }
        
        
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

               HttpSession session = request.getSession();
        
       String username=request.getParameter("username");
       String password=request.getParameter("password"); 

       
       if(username==null ||username.equals("")||password==null|| password.equals("")){
           message="Invalid Login.";
           request.setAttribute("message",message);
     
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        return;
    }
       else{
    
           message=username;
           request.setAttribute("message",message);
         }
        
       
       session.setAttribute("session",session);
      getServletContext().getRequestDispatcher("/WEB-INF/inventory.jsp").forward(request, response);
        return;
           
       }
       
        


                }



    

 

