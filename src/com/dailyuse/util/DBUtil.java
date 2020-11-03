package com.dailyuse.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtil {
	private static SqlSessionFactory fact = null;
	public static SqlSession getSession(){
		if (fact == null){
			Reader reader = null;
			try {
			reader =Resources.getResourceAsReader("mybatis.xml");
			fact =new SqlSessionFactoryBuilder().build(reader);
		}catch (IOException e){
			e.printStackTrace();	
		}finally{
			if(reader != null){
				
				try{
					reader.close();
				}catch(IOException e){
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
return fact.openSession();
}
}