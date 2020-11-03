package com.dailyuse.mapper;

import java.util.List;

public interface ProductingMapper {
	/**
	 * 读取所有商品
	 */
	public List<ProductingMapper> getProducting();

	/**
	 * 读取指定商品
	 */
	public ProductingMapper getProducting(int pno);

	/**
	 * 添加商品
	 */
	public int addProducting(ProductingMapper producting);

	/**
	 * 添加删除指定商品
	 */
	public int delProducting(int pno);

	/**
	 * 修改商品
	 */
	public int modifyProducting(ProductingMapper producting);

}



