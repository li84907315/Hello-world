package com.dailyuse.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.dailyuse.mapper.UsersMapper;
import com.dailyuse.model.UsersVo;
import com.dailyuse.util.DBUtil;
import com.yueqian.mgrDept.test.MD5Util;

public class UsersService {
	private static UsersService usersService;
	private UsersService(){}
	
	public static UsersService getInstance(){
		if(usersService == null){
			usersService = new UsersService();
		}
		return usersService;
	}

	/*
	 * 登录
	 */
	public UsersVo loging(String phone,String password){
		UsersVo logUser =null;
		//封装入参到map
		Map<String,Object> param = new HashMap<String,Object>();
	  param.put("phone",phone);
	  param.put("pwd",MD5Util.getDigest(password));
	  SqlSession session = null;
	   try {
		session = DBUtil.getSession();
		   UsersMapper umapper = session.getMapper(UsersMapper.class);
		  logUser = umapper.loging(param);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		session.close();
	}
	   return logUser;
	}
}


	

