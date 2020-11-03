package com.dailyuse.servlet;



import com.dailyuse.model.ResultInfo;
import com.dailyuse.model.UsersVo;
import com.dailyuse.service.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//import org.apache.commons.beanutils.BeanUtils;

@WebServlet(value = "/registUserServlet")
public class RegistUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取数据
//        Map<String, String[]> map = request.getParameterMap();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        String telephone = request.getParameter("telephone");

        //封装对象
        UsersVo user=new UsersVo();
        user.setUserName(username);
        user.setUserPwd(password);


        //调用service
        boolean flag = UserServiceImpl.genTnstance().regist(user);

//        boolean flag=service.regist(user);
        //从后端返回的对象
        ResultInfo resultInfo=new ResultInfo();
        //判断
        if(flag)
        {
            //注册成功
            resultInfo.setFlag(true);
        }
        else {
            //注册失败
            resultInfo.setFlag(false);
            resultInfo.setErrorMsg("注册失败！");
        }
        //将对象转换为json

        ObjectMapper mapper=new ObjectMapper();
        String json = mapper.writeValueAsString(resultInfo);
        //响应  到客户端
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
