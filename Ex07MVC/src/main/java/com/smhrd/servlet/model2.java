package com.smhrd.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.FullStack;


@WebServlet("/model2")
public class model2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//Model2로 요청 먼저!
				//1.DB 연동
				//2.SQL 실행 (FullStack 테이블안에 모든 값 가져오기)
				//3.3명의 학생정보 -> 세션
				// -> Ex02model2.jsp로 이동
				
				HttpSession session = request.getSession();
				Connection conn = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				FullStack fs = null;
				//ArrayList : 데이터 검색 용이
				//LinkedList : 중간 데이터 삭제, 추가 용이
				List<FullStack> list = new ArrayList<FullStack>();
				
				try{
					//오라클과 연결할 드라이버 가지고 오기 (동적 로딩)
				Class.forName("oracle.jdbc.OracleDriver");
				
				//지정한 데이터베이스와 연결하기 위한 객체(Connection) 생성
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="service";
				String password="12345";
				
				conn = DriverManager.getConnection(url, user, password);
				
				String sql = "select * from fullstack ";
				//sql 쿼리문을 다루기위한 객체(PreparedStatement) 생성
				ps = conn.prepareStatement(sql);

				
				
				//INSERT, DELETE, UPDATE -> excuteUpdate() -> int (몇 개행이 update 되었는지)
				//SELECT (READ) -> excuteQuery() -> ResultSet (읽어온 데이터, 커서)
				//sql 실행
				rs = ps.executeQuery();
				
				while(rs.next()){ //next() -> true(커서가 가리키고 있는 행에 데이터가 있음) / false(없음)
					String name = rs.getString("name"); //컬럼이름 지정
					String major = rs.getString("major"); //테이블 상 2번째 컬럼값 지정
					String phone = rs.getString("phone");
					
					//학생 한명의 정보!
					list.add(new FullStack(name, major, phone)); 
					
					//가지고온 학생 정보를
					
					}
				}catch(ClassNotFoundException e){
					//OracleDriver 가지고 올때 결로가 잘못됐을 경우
					System.out.println("클래스 못찾음!");
				}catch(SQLException e){
					System.out.println("sql 예외 발생!");
				}catch(Exception e){
					System.out.println("다른 예외 발생!");
					e.printStackTrace(); //원인, 발생하게 된 절차
				}finally{ //예외상황이 발생 하던지 / 하지 않던지 간에 무조건 실행!
					//사용한 자원 반환 (생성한 순서 반대로!)
					try{
					rs.close();
					ps.close();
					conn.close();
					}catch(Exception e){
						System.out.println("finally 에서 예외상황 발생!");
						e.printStackTrace();
			}
	
				}
				
				session.setAttribute("list", list);
				response.sendRedirect("Ex02model2.jsp");
	}
}
