package fr.arsangamarche.boutiqueapisanga.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class CategoriesParProduit extends BaseEntity implements Serializable{
	private Integer productId;
	private Integer [] categoryIds;
	 public CategoriesParProduit(){
			super();
		}

	public Integer[] getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(Integer[] categoryIds) {
		this.categoryIds = categoryIds;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}



}
