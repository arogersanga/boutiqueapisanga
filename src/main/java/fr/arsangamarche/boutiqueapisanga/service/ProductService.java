package fr.arsangamarche.boutiqueapisanga.service;

import java.util.List;

import fr.arsangamarche.boutiqueapisanga.model.Affichage;
import fr.arsangamarche.boutiqueapisanga.model.Category;
import fr.arsangamarche.boutiqueapisanga.model.Product;

public interface ProductService {
	public List<Product> findByCategoryId(int categoryId);
	public List<Product> findByAffichageIds(int affichageId);
	public Category findCategoryByName(String name);
	public Affichage findAffichageByName(String name);
	public Product findProductByName(String name);
	public List<Product> findAllProductsByCategoryName(String name);
}
