package fr.arsangamarche.boutiqueapisanga.service;

import java.util.List;

import fr.arsangamarche.boutiqueapisanga.model.Product;

public interface ProductService {
	public List<Product> findByCategoryId(int categoryId);
	public List<Product> findByAffichageIds(int affichageId);
}
