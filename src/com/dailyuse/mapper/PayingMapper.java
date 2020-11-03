package com.dailyuse.mapper;

import java.util.List;

import com.dailyuse.mapper.PayingMapper;

public interface PayingMapper {
	/**
	 * 读取所有订单
	 */
	public List<PayingMapper> getPaying();
	
	/**
	 * 读取指定订单
	 */
	public PayingMapper getPaying(int pno);
	
	/**
	 * 添加商品
	 */
	public int addPaying(PayingMapper paying);
	
	/**
	 * 添加删除指定订单
	 */
	public int delPaying(int pno);
	
	/**
	 * 修改订单
	 */
	public int modifyPaying(PayingMapper paying);

}
	

