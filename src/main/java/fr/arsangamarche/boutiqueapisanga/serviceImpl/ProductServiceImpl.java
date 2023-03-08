package fr.arsangamarche.boutiqueapisanga.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.arsangamarche.boutiqueapisanga.model.Product;
import fr.arsangamarche.boutiqueapisanga.repository.ProductRepository;
import fr.arsangamarche.boutiqueapisanga.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	List<Product> productsByCategoryList;
	

	List<Product> productsByAffichageList;
	
	@Autowired
	ProductRepository productRepository;
	
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
}
