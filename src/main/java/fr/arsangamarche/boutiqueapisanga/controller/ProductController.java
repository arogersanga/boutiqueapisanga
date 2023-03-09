package fr.arsangamarche.boutiqueapisanga.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.arsangamarche.boutiqueapisanga.model.Affichage;
import fr.arsangamarche.boutiqueapisanga.model.Category;
import fr.arsangamarche.boutiqueapisanga.model.Product;
import fr.arsangamarche.boutiqueapisanga.serviceImpl.ProductServiceImpl;

@Controller
@RequestMapping(path="/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {
	
	Product product;
	Affichage affichage;
	Category category;
	
	List<Product> productsByCategoryList = new ArrayList();
	List<Product> productsByAffichageList = new ArrayList();;
	@Autowired
    ProductServiceImpl productsServiceImpl;
	
	@GetMapping(path="products/productsByCategoryId/{categoryId}")
    public ResponseEntity<List<Product>> getProductsByCategoryId(@PathVariable("categoryId")  int categoryId) {
		this.productsByCategoryList = productsServiceImpl.findByCategoryId(categoryId);
    	
    	
    	 if(this.productsByCategoryList == null || this.productsByCategoryList.size() == 0){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         else{
             return new ResponseEntity<>(this.productsByCategoryList, HttpStatus.OK);
         }
    }
	
	@GetMapping(path="products/productsByAffichageId/{affichageId}")
    public ResponseEntity<List<Product>> getProductsByAffichageId(@PathVariable("affichageId")  int affichageId) {
		this.productsByAffichageList = productsServiceImpl.findByAffichageIds(affichageId);
    	
    	
    	 if(this.productsByAffichageList == null || this.productsByAffichageList.size() == 0){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         else{
             return new ResponseEntity<>(this.productsByAffichageList, HttpStatus.OK);
         }
    }
	
	@GetMapping(path="products/productsByCategoryName/{name}")
    public ResponseEntity<List<Product>> getAllProductsByCategoryName(@PathVariable("name") String name) {
		this.productsByCategoryList = productsServiceImpl.findAllProductsByCategoryName(name);
    	
    	
    	 if(this.productsByCategoryList == null || this.productsByCategoryList.size() == 0){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         else{
             return new ResponseEntity<>(this.productsByCategoryList, HttpStatus.OK);
         }
    }
	
	
	@GetMapping(path="products/productsByProductName/{name}")
    public ResponseEntity<Product> getProductsByProductName(@PathVariable("name") String name) {
    	this.product = productsServiceImpl.findProductByName(name);
    	
    	
    	 if(this.product == null){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         else{
             return new ResponseEntity<>(this.product, HttpStatus.OK);
         }
    }
	
	@GetMapping(path="categories/categoryByCategoryName/{name}")
    public ResponseEntity<Category> getCategoryByCategoryName(@PathVariable("name") String name) {
    	this.category = productsServiceImpl.findCategoryByName(name);
    	
    	
    	 if(this.category == null){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         else{
             return new ResponseEntity<>(this.category, HttpStatus.OK);
         }
    }
	
	@GetMapping(path="affichages/affichageByAffichageName/{name}")
    public ResponseEntity<Affichage> getAffichageByAffichageName(@PathVariable("name") String name) {
    	this.affichage = productsServiceImpl.findAffichageByName(name);
    	
    	
    	 if(this.affichage == null){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         else{
             return new ResponseEntity<>(this.affichage, HttpStatus.OK);
         }
    }

}
