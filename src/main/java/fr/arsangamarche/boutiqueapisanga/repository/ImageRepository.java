package fr.arsangamarche.boutiqueapisanga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.Image;


@CrossOrigin(maxAge = 3600)
public interface ImageRepository extends CrudRepository<Image, Integer>  {

}
