package web;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Produit;


@SuppressWarnings("unused")
@WebServlet (name="cs",urlPatterns= {"/controleur"})//remplace le web.xml
public class ControleurServlet extends HttpServlet{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImetierCatalogue metier;
     
     @Override
     public void init() throws ServletException {
    	 metier=new MetierImpl();//implémentation de la servlet
     }
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 String mc = request.getParameter("motCle");
    	 ProduiModele mod = new ProduiModele();
    	 mod.setMotCle(mc);
    	 List<Produit> prods = metier.getProduitsParMotCle(mc);
    	 mod.setProduits(prods);
    	 System.out.println("mod :"+mod);
    	 request.setAttribute("modele", mod);
    	 request.getRequestDispatcher("produits.jsp").forward(request, response);//ici on transmet à la vue la requet
     }
}
