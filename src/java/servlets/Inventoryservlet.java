/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.HomeItem;

/**
 *
 * @author parveen kaur
 */
public class Inventoryservlet extends HttpServlet {
    



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                   
     
        
        getServletContext().getRequestDispatcher("/WEB-INF/inventory.jsp").forward(request,response);
      return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session=request.getSession();
        
        String path = getServletContext().getRealPath("/WEB-INF/homeitems.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

      getServletContext().getRequestDispatcher("/WEB-INF/inventory.jsp").forward(request,response);
      return;
    }

  
  

}
