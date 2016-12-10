<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
  <head>
  </head>
  <body>
  	<form:form action="" method="post" commandName="emp">
  	员工名：<form:input path="name"/><br/>
  	年龄：<form:input path="age"/><br/>
  	简介：<form:textarea path="descr" cols="30" rows="5"/><br/>
  	性别：<form:radiobutton path="sex" value="M" label="男"/>
  			<form:radiobutton path="sex" value="F" label="女"/><br/>
  	喜欢的城市：<form:radiobuttons path="city" items="${cityMap}"/><br/>
  	喜欢的城市：<form:select path="city" items="${cityMap}"/><br/>
  	喜爱的运动：<form:select path="">
  					<form:option value="1">爬山</form:option>
  					<form:option value="2">驾云</form:option>
  					<form:option value="3">下海</form:option>
  					<option value="4">上网</option><!-- 注意两者的区别 -->
  					
  					<form:options items="${cityMap}"></form:options><!-- 这时是自动生成 -->
  				</form:select><br/>
  	兴趣：<form:checkbox path="favs" value="a" label="上网"/>
  			<form:checkbox path="favs" value="b" label="聊天"/>
  			<form:checkbox path="favs" value="c" label="交友"/><br/>
  			
  			<form:checkboxes items="${cityMap}" path="citys"/>
  			
  			<input type="submit" value="添加"/>
  	</form:form>
  </body>
</html>
