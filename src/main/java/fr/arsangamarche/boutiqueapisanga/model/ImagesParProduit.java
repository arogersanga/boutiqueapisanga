package fr.arsangamarche.boutiqueapisanga.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ImagesParProduit extends BaseEntity implements Serializable {
	private Integer [] imagesIds;
	private Integer productId;
	
	ImagesParProduit(){
		super();
	}
	
	public Integer[] getImagesIds() {
		return imagesIds;
	}
	public void setImagesIds(Integer[] imagesIds) {
		this.imagesIds = imagesIds;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
