package com.example.crud.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_products")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String sku;
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageUrl;
	@CreationTimestamp
	private LocalDateTime datecreated;
	@CreationTimestamp
	private LocalDateTime lastupdated;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public LocalDateTime getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(LocalDateTime datecreated) {
		this.datecreated = datecreated;
	}
	public LocalDateTime getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(LocalDateTime lastupdated) {
		this.lastupdated = lastupdated;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", price="
				+ price + ", active=" + active + ", imageUrl=" + imageUrl + ", datecreated=" + datecreated
				+ ", lastupdated=" + lastupdated + "]";
	}
	

}
