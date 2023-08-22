<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점확인결과</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    int javaScore = Integer.parseInt(request.getParameter("java"));
    int webScore = Integer.parseInt(request.getParameter("web"));
    int iotScore = Integer.parseInt(request.getParameter("iot"));
    int androidScore = Integer.parseInt(request.getParameter("and"));
    
    int totalScore = javaScore + webScore + iotScore + androidScore;
    double average = totalScore / 4.0;
    
    String grade;
    if (average >= 95) {
        grade = "A+";
    } else if (average >= 90) {
        grade = "A";
    } else if (average >= 85) {
        grade = "B+";
    } else if (average >= 80) {
        grade = "B";
    } else {
        grade = "F";
    }
%>

	



<fieldset  >
		<legend>학점확인프로그램</legend>
		<form action="Ex01Request.jsp">
			<table>
				<tr>
					<td>이름</td>
					<td><%= name %></td>
					
				</tr>
				<tr>
					<td>Java점수</td>
					<td><%= javaScore %></td>
					
				</tr>
				<tr>
					<td>Web점수</td>
					<td><%= webScore %></td>
				</tr>
				<tr>
					<td>IOT점수</td>
					<td><%= iotScore %></td>
				</tr>
				<tr>
					<td>Android점수</td>
					<td><%= androidScore %></td>
				</tr>
				<tr>
					<td>총점</td>
					<td><%= totalScore %></td>
				</tr>
				<tr>
					<td>평균</td>
					<td><%= average %></td>
				</tr>
				<tr>
					<td>학점</td>
					<td><b><%= grade %></b></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>