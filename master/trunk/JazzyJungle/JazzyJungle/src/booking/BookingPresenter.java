package booking;

import facebook.FacebookClientSingleton;
import facebook.FacebookStatus;
import facebook.Query;
import gallery.Image;
import home.AbstractPresenter;
import navigation.TemplateFor;
import org.antlr.stringtemplate.StringTemplate;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 10/11/13
 * Time: 00:59
 * To change this template use File | Settings | File Templates.
 */
public class BookingPresenter extends AbstractPresenter {

    public void execute(HttpServletRequest request, HttpServletResponse response) {

        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        FacebookClientSingleton.getInstance();
        List<FacebookStatus> statuses = FacebookClientSingleton.getPosts(Query.getFourPosts.getValue());

        StringTemplate page = TemplateFor.getStringTemplate(TemplateFor.booking.getValue(), request);
        page.setAttribute("status", statuses);
        out.print(page);

    }

    public void init(HttpServletRequest request, HttpServletResponse response){
        super.init(request,response);
    }

}
