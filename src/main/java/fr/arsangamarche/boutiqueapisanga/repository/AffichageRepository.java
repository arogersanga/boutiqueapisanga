package fr.arsangamarche.boutiqueapisanga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.Affichage;
import fr.arsangamarche.boutiqueapisanga.model.Product;

@CrossOrigin(maxAge = 3600)
public interface AffichageRepository extends CrudRepository<Affichage, Integer> {
	@Query("select a from Affichage a where a.name = :name")
	Affichage findAffichageByName(@Param("name") String name);
}
