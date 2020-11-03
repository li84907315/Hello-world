package com.dailyuse.mapper;

import java.util.List;

public interface ProductsMapper {
	/**
	 * 读取所有商品
	 */
	public List<ProductsMapper> getProducts();

	/**
	 * 读取指定商品
	 */
	public ProductsMapper getProducts(int pno);

	/**
	 * 添加商品
	 */
	public int addProducts(ProductsMapper products);

	/**
	 * 添加删除指定商品
	 */
	public int delProducts(int pno);

	/**
	 * 修改商品
	 */
	public int modifyProducts(ProductsMapper products);

}






