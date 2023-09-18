//package Filter;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//@WebFilter(urlPatterns = "/*") // chan tat ca *: any
//public class LogFilter implements Filter{
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		// TODO Auto-generated method stub
//		System.out.println("kkkkkk");
//		chain.doFilter(request, response);// goi ham nay de cho qua di
////		String key=request.getParameter("key");
////		if(key!=null) {
////			chain.doFilter(request, response);
////		}else {
////			PrintWriter pw= response.getWriter();
////			pw.println("NOOOO");
////		}
//		
//	}
//
//}
