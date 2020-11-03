<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>17商城</title>
<link type="text/css" href="css/css.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/js.js"></script>
</head>
<script type="text/javascript" src="./js/jquery-3.3.1.min.js"></script>
<script>

    $(function () {
        $("#registerForm").submit(function(){
            //1.发送数据到服务器



            $.post("/registUserServlet",$(this).serialize(),function(data){

                //处理服务器响应的数据  data  {flag:true,errorMsg:"注册失败"}

                if(data.flag){
                    //注册成功，跳转成功页面
                    location.href="index.jsp";
                }else{
                    //注册失败,给errorMsg添加提示信息
                    $("#errorMsg").html(data.errorMsg);

                }
            });


            //2.不让页面跳转
            return false;
            //如果这个方法没有返回值，或者返回为true，则表单提交，如果返回为false，则表单不提交
        })});


</script>

<body style=" background:#FFF;">
 <div class="loginLogo">
  <div class="logoMid">
   <h1 class="logo" style="height:71px;padding-top:10px;"><a href="index.jsp"><img src="images/loginLogo.jpg" width="241" height="71" /></a></h1>
   <div class="loginReg">
    还没有会员账号?&nbsp;<a href="login.jsp">登录</a>
   </div><!--loginReg/-->
  </div><!--logoMid/-->
 </div><!--loginLogo/-->
 <div class="loginBox">
  <img src="images/chengnuo.jpg" width="295" height="393" class="chengnuo" />
  <form id="registerForm" action="#">
   <div class="regList">
    <label><span class="red">*</span> 账户名</label>
    <input type="text" id="username" name="username" /> <span style="color:#999;">请输入邮箱/用户名/手机号</span>
   </div><!--regList/-->
   <div class="regList">
    <label><span class="red">*</span> 请设置密码</label>
    <input type="password" id="password" name="password"/>
   </div><!--regList/-->
   <div class="regList">
    <label><span class="password">*</span> 请确认密码</label>
    <input type="text" id="passwords" name="password" />
   </div><!--regList/-->
   <div class="reg">
    <input type="image" src="images/reg.jpg" width="284" height="34" />
   </div><!--reg/-->
  </form><!--reg/-->


  <div class="clears"></div>
 </div><!--loginBox/-->
</body>
</html>
