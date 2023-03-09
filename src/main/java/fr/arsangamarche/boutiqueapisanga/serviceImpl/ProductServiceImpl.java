package fr.arsangamarche.boutiqueapisanga.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.arsangamarche.boutiqueapisanga.model.Affichage;
import fr.arsangamarche.boutiqueapisanga.model.Category;
import fr.arsangamarche.boutiqueapisanga.model.Product;
import fr.arsangamarche.boutiqueapisanga.repository.AffichageRepository;
import fr.arsangamarche.boutiqueapisanga.repository.CategoryRepository;
import fr.arsangamarche.boutiqueapisanga.repository.ProductRepository;
import fr.arsangamarche.boutiqueapisanga.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	List<Product> productsByCategoryList;
	

	List<Product> productsByAffichageList;
	
	Product product;
	Affichage affichage;
	Category category;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	AffichageRepository affichageRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Product> findByCategoryId(int categoryId) {
		this.productsByCategoryList = productRepository.findByCategoryId(categoryId);
		return this.productsByCategoryList;
	}
	
	@Override
	public List<Product> findByAffichageIds(int affichageId) {
		this.productsByAffichageList = productRepository.findByAffichageIds(affichageId);
		return this.productsByAffichageList;
	}

	@Override
	public Category findCategoryByName(String name) {
		this.category = this.categoryRepository.findCategoryByName(name);
		return this.category;
	}

	@Override
	public Affichage findAffichageByName(String name) {
		this.affichage = this.affichageRepository.findAffichageByName(name);
		return this.affichage;
	}

	@Override
	public Product findProductByName(String name) {
		this.product = this.productRepository.findProductByName(name);
		return this.product;
	}

	@Override
	public List<Product> findAllProductsByCategoryName(String name) {
		this.productsByCategoryList = this.productRepository.findAllProductsByCategoryName(name);
		return this.productsByCategoryList;
	}
}
