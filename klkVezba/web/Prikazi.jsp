<%-- 
    Document   : Prikazi
    Created on : Jun 3, 2023, 1:17:42 AM
    Author     : Petar
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.BojaDlake"%>
<%@page import="beans.Labrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesija = request.getSession();
    Labrador lab = (Labrador) sesija.getAttribute("labrador");
    ArrayList<BojaDlake> boja_dlake = (ArrayList<BojaDlake>) sesija.getAttribute("boja_dlake");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr><td>Rasa</td><td>Vrsta</td><td>Velicina</td><td>Duzina dlake</td><td>Boja dlake</td><td>Boja oka</td></tr>
            <tr>
                <td><% for (BojaDlake s : boja_dlake) {
                        out.print(s.getBojaDlake1()+",");
                    }%></td>
            </tr>
        </table>
    </body>
</html>
