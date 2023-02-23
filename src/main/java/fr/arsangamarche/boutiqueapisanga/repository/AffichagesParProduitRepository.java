package fr.arsangamarche.boutiqueapisanga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.AffichagesParProduit;

@CrossOrigin(maxAge = 3600)
public interface AffichagesParProduitRepository  extends CrudRepository<AffichagesParProduit, Integer> {

}
