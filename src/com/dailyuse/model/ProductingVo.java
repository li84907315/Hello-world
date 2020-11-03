package com.dailyuse.model;

public class ProductingVo {
	private int pId;
	private ProductsVo products;
	private PayingVo paying;
	private int buyNum;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public ProductsVo getProducts() {
		return products;
	}
	public void setProducts(ProductsVo products) {
		this.products = products;
	}
	public PayingVo getPaying() {
		return paying;
	}
	public void setPaying(PayingVo paying) {
		this.paying = paying;
	}
	public int getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}
	
}

	