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
		application.setAttribute("nickname","풀스택");
		String nick = (String)application.getAttribute("nickname"); //오브젝트 타입 다운 캐스팅
	%>
	<%=nick %><br>
	${nickname }
	${applicationScope.nickname }
	<a href="Ex04application2.jsp">2로 이동</a>
</body>
</html>