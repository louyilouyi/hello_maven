<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
  <head>
  </head>
  <body>
  <!-- commandName是服务端发送过来的 -->
  <div style="align:center;">
  	<form:form commandName="user" action="add.from" method="post">
  	<!-- 标签写成这样，在第一次进入页面时，需要在UserController的toAdd方法中需要给User的信息赋值 -->
	  	&nbsp;用户名：<form:input path="username"/>
	  	<form:errors path="username" cssStyle="color:red"/><br/>
	  	&nbsp;&nbsp;密码：<form:password path="password" showPassword="false"/>
	  	<form:errors path="password" cssStyle="color:red"/><br/>
	  	电话号码：<form:input path="phone"/><!-- 必须与对应的bean的属性值相同 -->
	  	<form:errors path="phone" cssStyle="color:red"/><br/>
	  	<input type="submit" value="注册"/><input type="reset" value="取消">
  	</form:form>
  </div>
  </body>
</html>
