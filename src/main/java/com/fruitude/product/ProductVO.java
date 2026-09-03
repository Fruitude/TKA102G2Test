package com.fruitude.product;

import java.time.LocalDateTime;

public class ProductVO implements java.io.Serializable {

	private Integer productId;
	private Integer productCategoryId;
	private Integer vendorId;
	private String productName;
	private String productDesc;
	private Integer status;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private Integer allCommentAmount;
	private Integer allCommentStar;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
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