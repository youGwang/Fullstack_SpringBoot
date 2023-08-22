<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String subject = request.getParameter("subject");
	String[] menu = request.getParameterValues("menu");
	
	 
	Random rd = new Random();
	 int a = rd.nextInt(menu.length);

%>
	<b>랜덤 당첨 게임</b>
	<fieldset>
		<legend>랜덤뽑기결과</legend>
		<form action="">
			<table>
				<tr>
					<td><%=subject%></td>
				</tr>
				<tr>
					<td><%=menu[a]%></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>