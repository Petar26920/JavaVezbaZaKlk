/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servleti;

import beans.BojaDlake;
import beans.BojaOka;
import beans.FrancuskiBuldog;
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

/**
 *
 * @author Petar
 */
@WebServlet(name = "ServletFrancuskiBuldog", urlPatterns = {"/ServletFrancuskiBuldog"})
public class ServletFrancuskiBuldog extends HttpServlet {

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
        FrancuskiBuldog buldog = new FrancuskiBuldog();
        Karakteristike kke = new Karakteristike();
        ArrayList<BojaDlake> boja_dlake = new ArrayList<>();
        ArrayList<BojaOka> boja_oka = new ArrayList<>();
        buldog.setRasa("Francuski buldog");
        buldog.setVrsta("Kucni pas");
        buldog.setGodine(5);
        kke.setVelicina("mali");
        kke.setDuzinaDlake("kratka");
        
        BojaDlake bela = new BojaDlake(); bela.setBojaDlake1("bela");
        BojaDlake braon = new BojaDlake(); braon.setBojaDlake1("braon");
        BojaDlake siva = new BojaDlake(); siva.setBojaDlake1("siva");
        BojaDlake crna_bela = new BojaDlake(); crna_bela.setBojaDlake1("crna-bela");
        BojaDlake crna = new BojaDlake(); crna.setBojaDlake1("crna");
        boja_dlake.add(bela);boja_dlake.add(braon);boja_dlake.add(siva);boja_dlake.add(crna_bela);boja_dlake.add(crna);
  
        BojaOka braonOko = new BojaOka();
        braonOko.setBojaOka1("braon");
        BojaOka crnoOko = new BojaOka();
        crnoOko.setBojaOka1("crno");
        boja_oka.add(braonOko);boja_oka.add(crnoOko);
        
        RequestDispatcher rd = request.getRequestDispatcher("Prikazi.jsp");
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
