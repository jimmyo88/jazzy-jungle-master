package navigation;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 15/11/13
 * Time: 20:52
 * To change this template use File | Settings | File Templates.
 */
public class ResourceFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String path = req.getRequestURI().substring(req.getContextPath().length());

        if (path.startsWith("/resources/")|| pathContainsImage(path) || pathContainsJavaScript(path)){
            filterChain.doFilter(servletRequest, servletResponse);
        }

        else if(path.startsWith("/booking/update")){
            servletRequest.getRequestDispatcher("booking/update" + path).forward(servletRequest, servletResponse);
        }

         else {
            servletRequest.getRequestDispatcher("/pages" + path).forward(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
    }

    public boolean pathContainsImage(String path){
        return(path.endsWith(".png") || path.endsWith(".jpg") || path.endsWith(".ico"));
    }

    public boolean pathContainsJavaScript(String path){
        return(path.endsWith(".js"));
    }



}
