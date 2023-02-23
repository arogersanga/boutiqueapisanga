package fr.arsangamarche.boutiqueapisanga.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class AffichagesParProduit extends BaseEntity implements Serializable {
	private Integer [] affichageIds;
	private Integer productId;

	AffichagesParProduit(){
		super();
	}

	public Integer[] getAffichageIds() {
		return affichageIds;
	}
	public void setAffichageIds(Integer[] affichageIds) {
		this.affichageIds = affichageIds;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
}
