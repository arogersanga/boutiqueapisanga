package fr.arsangamarche.boutiqueapisanga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.Slides;

@CrossOrigin(maxAge = 3600)
public interface SlidesRepository extends CrudRepository<Slides, Integer> {

}
