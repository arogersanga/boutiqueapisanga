package fr.arsangamarche.boutiqueapisanga.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Category extends BaseEntity implements Serializable {
	private String name;
	private boolean hasSubCategory;
	private Integer parentId;

	Category(){
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHasSubCategory() {
		return hasSubCategory;
	}
	public void setHasSubCategory(boolean hasSubCategory) {
		this.hasSubCategory = hasSubCategory;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}
