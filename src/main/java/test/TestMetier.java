package test;

import java.util.List;

import metier.MetierImpl;
import metier.Produit;

public class TestMetier {

	public static void main(String[] args) {
		MetierImpl metier = new MetierImpl();
		List<Produit> prods = metier.getProduitsParMotCle("Clavier");//nous testons une recherche
		
		for (Produit p : prods) {
			System.out.println(p.getNomProduit());
		}
	}

}
