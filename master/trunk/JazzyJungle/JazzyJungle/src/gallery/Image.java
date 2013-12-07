package gallery;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 24/11/13
 * Time: 01:04
 * To change this template use File | Settings | File Templates.
 */
public class Image {

    String path;
    String height = "75";
    String width  = "100";

    public Image(String path) {
        this.path = path;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }



}
