package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
	
	public void destroy() {
	}


	public void init(FilterConfig arg0) throws ServletException {
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String servletPath = req.getServletPath();
		HttpSession session = req.getSession();
		String flag = (String) session.getAttribute("flag");
		if(servletPath!=null && ( servletPath.equals("/hhh/login.jsp")
				|| servletPath.equals("/hhh/index.jsp") 
						|| servletPath.equals("/LoginSrvlet") )){
			chain.doFilter(request, response);
		}else{
			if(flag!=null && flag.equals("error")){
				req.setAttribute("msg", "登录失败，请重新登录！");
				req.setAttribute("returnuri", servletPath);
				RequestDispatcher rd = req.getRequestDispatcher("/hhh/login.jsp");
				rd.forward(req, resp);
			}else{
				req.setAttribute("msg", "你尚未登录，请登录！");
				req.setAttribute("flag", servletPath);
				RequestDispatcher rd = req.getRequestDispatcher("/hhh/login.jsp");
				rd.forward(req, resp);
			}
		}
		
	}
}
