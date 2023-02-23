package fr.arsangamarche.boutiqueapisanga.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Banners extends BaseEntity implements Serializable{
	private String title;
	private String subtitle;
	private Integer affichageId;
	private Integer productId;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	Banners() {
		super();
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getAffichageId() {
		return affichageId;
	}
	public void setAffichageId(Integer affichageId) {
		this.affichageId = affichageId;
	}

	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}


}
