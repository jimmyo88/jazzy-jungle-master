package home;

import navigation.UriForServlet;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 10/11/13
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class PresenterFactory {
    public static final Presenter getPresenterByClass(Class actionClass) {
        try {
            Presenter presenter = (Presenter) actionClass.newInstance();

            return (Presenter) actionClass.newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();

        } catch (ClassCastException e) {
            e.printStackTrace();

        }
        return null;
    }

    public static final Presenter getPresenterByFullClassName(String className) {
        try {
//            UriForServlet(className);
            if(className.equals("")) className="home";
            String servletUri = UriForServlet.valueOf(className).getValue();
//            String name = "home." + className + "Presenter";
            Class actionClass = Class.forName(servletUri);
            return getPresenterByClass(actionClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
