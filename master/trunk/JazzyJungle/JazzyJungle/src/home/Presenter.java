package home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 10/11/13
 * Time: 14:31
 * To change this template use File | Settings | File Templates.
 */
public interface Presenter {
    public void execute(HttpServletRequest request, HttpServletResponse response);
    public void init(HttpServletRequest request, HttpServletResponse response);
}
