package fatalvirus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	// http 요청을 처리하기 위한 메서드 작성
	public void doGet(
		HttpServletRequest req,
		HttpServletResponse res) throws IOException {
		// 응답할 컨텐츠 유형 정의
		res.setContentType("text/html; charset=UTF-8");
		
		// 응답객체의 printWriter를 이용해서
		// 브라우저에 보여줄 내용(HTML)을 작성
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>Hello, Servlet!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello, Servlet!!</h1>");
		out.println("<h1>안녕하세요! 서블릿!!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	

}
