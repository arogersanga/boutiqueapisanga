package fr.arsangamarche.boutiqueapisanga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.arsangamarche.boutiqueapisanga.model.Banners;

@CrossOrigin(maxAge = 3600)
public interface BannersRepository  extends CrudRepository<Banners, Integer> {


}
