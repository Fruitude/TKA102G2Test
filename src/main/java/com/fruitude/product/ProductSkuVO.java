package com.fruitude.product;

import java.time.LocalDateTime;

public class ProductSkuVO implements java.io.Serializable {

	private Integer skuId;
	private Integer productId;
	private String skuName;
	private String anotherName;
	private Integer stock;
	private Integer safetyStock;
	private Integer intboundQty;
	private Integer outboundQty;
	private Integer price;
	private Integer status;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private Integer allCommentAmount;
	private Integer allCommentStar;
	
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getAnotherName() {
		return anotherName;
	}
	public void setAnotherName(String anotherName) {
		this.anotherName = anotherName;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getSafetyStock() {
		return safetyStock;
	}
	public void setSafetyStock(Integer safetyStock) {
		this.safetyStock = safetyStock;
	}
	public Integer getIntboundQty() {
		return intboundQty;
	}
	public void setIntboundQty(Integer intboundQty) {
		this.intboundQty = intboundQty;
	}
	public Integer getOutboundQty() {
		return outboundQty;
	}
	public void setOutboundQty(Integer outboundQty) {
		this.outboundQty = outboundQty;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Integer getAllCommentAmount() {
		return allCommentAmount;
	}
	public void setAllCommentAmount(Integer allCommentAmount) {
		this.allCommentAmount = allCommentAmount;
	}
	public Integer getAllCommentStar() {
		return allCommentStar;
	}
	public void setAllCommentStar(Integer allCommentStar) {
		this.allCommentStar = allCommentStar;
	}

	}