/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servleti;

import beans.BojaDlake;
import beans.BojaOka;
import beans.Karakteristike;
import beans.Labrador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Petar
 */
@WebServlet(name = "ServletLabrador", urlPatterns = {"/ServletLabrador"})
public class ServletLabrador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Labrador labrador = new Labrador();
        Karakteristike kke = new Karakteristike();
        ArrayList<BojaDlake> boja_dlake = new ArrayList<>();
        ArrayList<BojaOka> boja_oka = new ArrayList<>();
        labrador.setRasa("Labrador");
        labrador.setVrsta("Lovacki pas");
        labrador.setGodine(10);
        kke.setVelicina("velik");
        kke.setDuzinaDlake("kratka");
        
        BojaDlake braon = new BojaDlake(); braon.setBojaDlake1("braon");
        BojaDlake zlatna = new BojaDlake(); zlatna.setBojaDlake1("zlatna");
        BojaDlake bela = new BojaDlake(); bela.setBojaDlake1("bela");
        BojaDlake crna = new BojaDlake(); crna.setBojaDlake1("crna");
        boja_dlake.add(braon);boja_dlake.add(zlatna);boja_dlake.add(bela);boja_dlake.add(crna);
  
        BojaOka braonOko = new BojaOka();
        braonOko.setBojaOka1("braon");
        BojaOka crnoOko = new BojaOka();
        crnoOko.setBojaOka1("crno");
        boja_oka.add(braonOko);boja_oka.add(crnoOko);
        HttpSession sesija = request.getSession();
        sesija.setAttribute("labrador", labrador);
        sesija.setAttribute("boja_dlake", boja_dlake);
        RequestDispatcher rd = request.getRequestDispatcher("ServletFrancuskiBuldog");
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
