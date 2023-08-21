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
	
	
	String ope = request.getParameter("ope"); 
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	  if(ope.equals("+")){
			out.print(num1+"+"+num2+"="+(num1+num2));	  
	  }else if(ope.equals("-")){
		  out.print(num1+"-"+num2+"="+(num1-num2));	  
	  }else if(ope.equals("*")){
		  out.print(num1+"*"+num2+"="+(num1*num2));	  
	  }else{
		  out.print(num1+"/"+num2+"="+(num1/num2));	  
	  }
	%>
</body>
</html>