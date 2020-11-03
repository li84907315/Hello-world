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
 <script type="text/javascript">
  $(function(){
	  if("${errMsg}"){
  
      alert("${errMsg}");
	  }
});
</script>
</head>

<body style=" background:#FFF;">
 <div class="loginLogo">
  <div class="logoMid">
   <h1 class="logo" style="height:71px;padding-top:10px;"><a href="index.jsp"><img src="images/loginLogo.jpg" width="241" height="71" /></a></h1>
   <div class="loginReg">
    还没有会员账号?&nbsp;<a href="reg.jsp">免费注册</a>
   </div><!--loginReg/-->
  </div><!--logoMid/-->
 </div><!--loginLogo/-->
 <div class="loginBox">
  <div class="loginLeft">
   <img src="images/logoinimg.jpg" width="716" height="376" />
  </div><!--loginLeft/-->
  <form action="./UsersServlet" method="post" class="loginRight">
  <input type ="hidden" value ="login" name ="operType" />
   <h2>会员登录</h2>
   <h3>用户
   <li>用户电话
   <input name="userPhone" type="text" class="name" />
   <h3>密码</h3>
   <li>用户密码
   <input name="userPwd" type="password" class="pwd" />
   <div class="zhuangtai">
    <input type="checkbox" checked="checked" /> 下次自动登录
   </div><!--zhuangtai/-->
   <div class="subs">
    <input type="image" src="images/sub.jpg" class="submit" />
   </div>
  </form><!--loginRight/-->
  <div class="clears"></div>
 </div><!--loginBox/-->

</body>
</html>
