package navigation;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 11/11/13
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 */
public enum UriForServlet {
    home("home.HomePresenter"),
    about("about.AboutPresenter"),
    gallery("gallery.GalleryPresenter"),
    booking("booking.BookingPresenter"),

    update("booking.FormValidator");

    private final String servletUri;

    UriForServlet(String servletUri) {
        this.servletUri = servletUri;
    }

    public String getValue() {
        return servletUri;
    }


}
