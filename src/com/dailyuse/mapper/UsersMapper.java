package com.dailyuse.mapper;

import java.util.Map;

import com.dailyuse.model.UsersVo;

public interface UsersMapper {
	/*
	 * 登录
	 */
	public UsersVo loging(Map<String, Object> param);
}
