package pl.edu.agh.bazydanych.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categories database table.
 * 
 */
@Entity
@Table(name="categories")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"CategoryID\"")
	private Integer categoryID;

	@Column(name="\"CategoryName\"")
	private String categoryName;

	@Column(name="\"Description\"")
	private String description;

	@Column(name="\"Picture\"")
	private byte[] picture;

	public Category() {
	}

	public Integer getCategoryID() {
		return this.categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

}