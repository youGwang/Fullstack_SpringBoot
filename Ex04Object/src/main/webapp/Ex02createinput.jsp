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
int number = Integer.parseInt(request.getParameter("number"));


 

%>

	<b>랜덤 당첨 게임</b>
	<fieldset>
		<legend>랜덤 뽑기</legend>
		<form action="Ex02randomOutput.jsp">
			<table>
				<tr>
					<td>주제 : <input type="text" name="subject"></td>
				</tr>
<%
	
	for(int i=1;i<=number;i++){
		out.print("<tr> <td>아이템 : <input type='text' name='menu'></td> </tr> " );
	}



%>
	
				<tr>
					<td><input type="submit" value="랜덤뽑기"></td>
				</tr>
				
			</table>
		</form>
	</fieldset>
</body>
</html>