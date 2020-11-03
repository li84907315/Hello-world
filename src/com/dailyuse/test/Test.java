package com.dailyuse.test;

import org.apache.ibatis.session.SqlSession;

import com.dailyuse.util.DBUtil;
import com.yueqian.mgrDept.test.MD5Util;

public class Test {
	public static void main(String[] args) {
		//SqlSession session = DBUtil.getSession();
		//System.out.println(session);
		
		System.out.println(MD5Util.getDigest("456"));
	}
	

}
