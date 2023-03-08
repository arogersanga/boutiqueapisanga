package fr.arsangamarche.boutiqueapisanga.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.arsangamarche.boutiqueapisanga.model.Product;
import fr.arsangamarche.boutiqueapisanga.serviceImpl.ProductServiceImpl;

@Controller
@RequestMapping(path="/products")
public class ProductController {
	
	List<Product> productsByCategoryList = new ArrayList();
	List<Product> productsByAffichageList = new ArrayList();;
	@Autowired
    ProductServiceImpl productsServiceImpl;
	
	@GetMapping(path="/productsByCategoryId/{categoryId}")
    public ResponseEntity<List<Product>> getProductsByCategoryId(@PathVariable("categoryId")  int categoryId) {
    	productsByCategoryList = productsServiceImpl.findByCategoryId(categoryId);
    	
    	
    	 if(productsByCategoryList == null || productsByCategoryList.size() == 0){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         else{
             return new ResponseEntity<>(productsByCategoryList, HttpStatus.OK);
         }
    }
	
	@GetMapping(path="/productsByAffichageId/{affichageId}")
    public ResponseEntity<List<Product>> getProductsByAffichageId(@PathVariable("affichageId")  int affichageId) {
		productsByAffichageList = productsServiceImpl.findByAffichageIds(affichageId);
    	
    	
    	 if(productsByAffichageList == null || productsByAffichageList.size() == 0){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         else{
             return new ResponseEntity<>(productsByAffichageList, HttpStatus.OK);
         }
    }

}
