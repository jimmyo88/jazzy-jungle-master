package navigation;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 11/11/13
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 */
public enum TemplateFor {
     homepage("homepage/home"),
     about("about/about"),
     gallery("gallery/gallery"),
     booking("booking/booking");


    private final String templatePath;

    TemplateFor(String servletUri, HttpServletRequest request) {
        this.templatePath = servletUri;
    }

    TemplateFor(String servletUri) {
        this.templatePath = servletUri;
    }

    public String getValue() {
        return templatePath;
    }

    public static StringTemplate getStringTemplate(String pageUri, HttpServletRequest request) {
        ServletContext context = request.getServletContext();
        String templatePath = context.getRealPath("/WEB-INF");
        StringTemplateGroup group = new StringTemplateGroup("underwebinf", templatePath);
        return group.getInstanceOf(pageUri);
    }


}
