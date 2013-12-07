package gallery;

import facebook.FacebookClientSingleton;
import facebook.FacebookStatus;
import facebook.Query;
import home.AbstractPresenter;
import navigation.TemplateFor;
import org.antlr.stringtemplate.StringTemplate;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 10/11/13
 * Time: 00:59
 * To change this template use File | Settings | File Templates.
 */
public class GalleryPresenter extends AbstractPresenter {

    public void execute(HttpServletRequest request, HttpServletResponse response) {

        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        FacebookClientSingleton.getInstance();
        List<FacebookStatus> statuses = FacebookClientSingleton.getPosts(Query.getFourPosts.getValue());

        StringTemplate page = TemplateFor.getStringTemplate(TemplateFor.gallery.getValue(), request);
        page.setAttribute("status", statuses);
        page.setAttribute("image", getImagePaths());
        out.print(page);

    }

    public void init(HttpServletRequest request, HttpServletResponse response){
        super.init(request,response);
    }

    public List<Image> getImagePaths(){
        List<Image> results = new ArrayList<Image>();

        ServletContext context = getRequest().getServletContext();
        String path = context.getRealPath("/resources/images/thumbnails");

        File[] files = new File(path).listFiles();
        for (File file : files) {
            if (file.isFile()) {
                results.add(new Image(file.getName()));
            }
        }

        return results;
    }

}
