package navigation;

import home.Presenter;
import home.PresenterFactory;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletDispatcher extends HttpServlet
{
    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            try {
                String url = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/") + 1, request.getRequestURL().length());
                Presenter presenter = PresenterFactory.getPresenterByFullClassName(url);

                presenter.init(request,response);
                presenter.execute(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                out.close();
            }
        }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}







