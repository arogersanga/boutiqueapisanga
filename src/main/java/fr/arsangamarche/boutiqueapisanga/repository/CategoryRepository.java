package fr.arsangamarche.boutiqueapisanga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.Affichage;
import fr.arsangamarche.boutiqueapisanga.model.Category;

@CrossOrigin(maxAge = 3600)
public interface CategoryRepository extends CrudRepository<Category, Integer>{
	@Query("select c from Category c where c.name = :name")
	Category findCategoryByName(@Param("name") String name);
}
