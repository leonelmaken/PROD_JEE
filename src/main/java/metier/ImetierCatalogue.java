package metier;

import java.util.List;

public interface ImetierCatalogue {
 
	public List<Produit> getProduitsParMotCle(String mc);//reçoit en paramètre un mot clé et retourne une liste de produit dans le nom contient le mot clé
	public void addProduit(Produit p);//ajoute un produit dans la data-base
}
