package fr.arsangamarche.boutiqueapisanga.model;


import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;

  public int getId() {

          return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }
}

