package com.dailyuse.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dailyuse.model.UsersVo;
import com.dailyuse.service.UsersService;

@WebServlet("/UsersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsersServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//区分不同的请求参数区别
		String operType = request.getParameter("operType");
		//登陆操作
		if("login".equals(operType)){
			String userPhone = request.getParameter("userPhone");
			String userPwd = request.getParameter("userPwd");
			//查询数据库
		UsersVo logUser = UsersService.getInstance().loging(userPhone, userPwd);
		//判断是否登录成功
		if(logUser == null){
			//登录失败
			request.setAttribute("errMsg","用户名密码有误,登录失败!");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else{
			//登录成功
			//记录登录的用户信息到session范围
			request.getSession().setAttribute("logUser", logUser);
			//重定向到主页
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
	
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doGet(request,response);
		
	}
}



