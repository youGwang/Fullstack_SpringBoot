<%@page import="com.smhrd.model.FullStack"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 세션안에 저장되어있는 학생정보(3명) 테이블 출력 -->

	<%
	
	ArrayList<FullStack> a = (ArrayList<FullStack>)session.getAttribute("list");
	

//"name"
//"major"
//"phone"
	for(int i=0;i<3 ;i++){
		  out.print (a.get(i).getName()+" ");
		  out.print (a.get(i).getmajor()+" ");
		  out.print (a.get(i).getphone()+" ");
	}


	
	%>
	
	
	
</body>
</html>