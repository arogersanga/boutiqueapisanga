package fr.arsangamarche.boutiqueapisanga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.Product;

@CrossOrigin(origins = "*", maxAge = 3600)
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
