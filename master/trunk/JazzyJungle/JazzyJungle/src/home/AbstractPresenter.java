package home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 10/11/13
 * Time: 14:32
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractPresenter implements Presenter {
    private HttpServletRequest request;
    private HttpServletResponse response;
    protected String returnPage;


    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.setRequest(request);
        this.setResponse(response);
    }

    public void setReturnPage(String page) {
        returnPage = page;
    }

    public String getReturnPage() {
        return returnPage;
    }


    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }
}
