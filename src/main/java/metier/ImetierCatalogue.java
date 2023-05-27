package metier;

import java.util.List;

public interface ImetierCatalogue {
 
	public List<Produit> getProduitsParMotCle(String mc);//re�oit en param�tre un mot cl� et retourne une liste de produit dans le nom contient le mot cl�
	public void addProduit(Produit p);//ajoute un produit dans la data-base
}
