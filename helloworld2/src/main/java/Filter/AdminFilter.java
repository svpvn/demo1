package Filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req =(HttpServletRequest) request;
		HttpSession session = req.getSession();
		Object key= session.getAttribute("loginUser");
		if(key!=null && String.valueOf(key).equals("nam")) {
			chain.doFilter(request, response);
		}else {
			PrintWriter pw= response.getWriter();
			pw.println("NOOOO");
	}

}
}
