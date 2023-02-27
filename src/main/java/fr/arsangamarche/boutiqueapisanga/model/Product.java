package fr.arsangamarche.boutiqueapisanga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.type.BlobType;

import lombok.Data;

@Data
@Entity
public class Product extends BaseEntity implements Serializable{
	private String name;
	private String [] images;
	private Integer [] imagesIds;
	private String oldPrice;
	private String newPrice;
	private String discount;
	private float ratingsCount;
	private float ratingsValue;
	private String description;
	private Integer availibilityCount;
	private Integer cartCount;
	private String [] color;
	private String [] size;
	private Integer weight;
	private Integer [] categoryIds;
	private Integer [] affichageIds;

	Product(){
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer[] getImagesIds() {
		return imagesIds;
	}
	public void setImagesIds(Integer[] imagesIds) {
		this.imagesIds = imagesIds;
	}
	public String getOldPrice() {
		return oldPrice;
	}
	public void setOldPrice(String oldPrice) {
		this.oldPrice = oldPrice;
	}
	public String getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(String newPrice) {
		this.newPrice = newPrice;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public float getRatingsCount() {
		return ratingsCount;
	}
	public void setRatingsCount(float ratingsCount) {
		this.ratingsCount = ratingsCount;
	}
	public float getRatingsValue() {
		return ratingsValue;
	}
	public void setRatingsValue(float ratingsValue) {
		this.ratingsValue = ratingsValue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAvailibilityCount() {
		return availibilityCount;
	}
	public void setAvailibilityCount(Integer availibilityCount) {
		this.availibilityCount = availibilityCount;
	}
	public Integer getCartCount() {
		return cartCount;
	}
	public void setCartCount(Integer cartCount) {
		this.cartCount = cartCount;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public String[] getSize() {
		return size;
	}
	public void setSize(String[] size) {
		this.size = size;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer[] getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(Integer[] categoryIds) {
		this.categoryIds = categoryIds;
	}

	public Integer[] getAffichageIds() {
		return affichageIds;
	}

	public void setAffichageIds(Integer[] affichageIds) {
		this.affichageIds = affichageIds;
	}
	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

}
