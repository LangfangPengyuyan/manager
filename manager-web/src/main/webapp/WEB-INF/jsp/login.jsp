<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
</head>
<body style="background-color: #F3F3F3">
	<form action="/tbUser/selectOne" method="post" id="login_frm">
		<div align="center">
			<hr>
		</div>
		<div align="center" style="width: 20%;margin:0 auto ;border: 1px solid #0f0f0f;position: absolute;top:30%;left:40%">
			<input type="hidden" name="submitFlag" value="login"/>
			<br/>
			用户名:
			<input type="text" name="username"/>
			<br/>
			密&#12288码:
			<input type="password" name="password"/>
			<br/>
			<br/>
			<br/>
			<br/>
			<div align="center">
				<input type="submit" value="登 录"/>

			</div>
		</div>
		<br/>
	</form>
</body>
</html>