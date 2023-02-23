package fr.arsangamarche.boutiqueapisanga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.Affichage;

@CrossOrigin(maxAge = 3600)
public interface AffichageRepository extends CrudRepository<Affichage, Integer> {

}
