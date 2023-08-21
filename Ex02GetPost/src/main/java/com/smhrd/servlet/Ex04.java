package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04")
public class Ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String[] hobby = request.getParameterValues("hobby");
		String date = request.getParameter("date");
		String color = request.getParameter("color");
		String text = request.getParameter("text");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pww = request.getParameter("pww");
		
		
		
		System.out.println("아이디 : "+id);
		System.out.println("비밀번호 : "+pw);
		if(!pw.equals(pww)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}else if(pw.equals(pww)) {
			System.out.println("비밀번호가 일치합니다!");
		}
		System.out.println("성별 : "+gender);
		System.out.println("혈액형 : "+blood);
		System.out.println("생일 : "+date);
		System.out.println("취미 : " +Arrays.toString(hobby));
		System.out.println("좋아하는 색 : "+color);
		System.out.println("남기고 싶은 말 : "+text);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("아이디 : "+id+"<br>");
		out.print("비밀번호 : "+pw+"<br>");
		if(!pw.equals(pww)) {
			out.print("비밀번호가 일치하지 않습니다."+"<br>");
		}else if(pw.equals(pww)) {
			out.print("비밀번호가 일치합니다!"+"<br>");
		}
		out.print("성별 : "+gender+"<br>");
		out.print("혈액형 : "+blood+"<br>");
		out.print("생일 : "+date+"<br>");
		out.print("취미 : " +Arrays.toString(hobby)+"<br>");
		out.print("좋아하는 색 : "+color+"<br>");
		out.print("남기고 싶은 말 : "+text+"<br>");
	}

}
