package fr.arsangamarche.boutiqueapisanga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.Product;

@CrossOrigin(origins = "*", maxAge = 3600)
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	@Query("select p from Product p where p.categoryId = :categoryId")
	List<Product> findByCategoryId(@Param("categoryId") int categoryId);
	
	@Query("select p from Product p where p.affichageIds like('%:affichageId%')")
	List<Product> findByAffichageIds(@Param("affichageId") int affichageId);	 
}
