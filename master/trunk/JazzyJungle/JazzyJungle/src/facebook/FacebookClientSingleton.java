package facebook;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;

import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 16/11/13
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */

public class FacebookClientSingleton {

    private static FacebookClientSingleton instance = null;
    private static FacebookClient facebookClient;
    private static String apiKey = "CAACEdEose0cBADF8NAZAMM2qciCKhhZCRM9aXJPbYqEd7YqmzZAGIbHlMJJBWZBLN4FGo9z5DOGh3xy5rsMafyyw549luo9wZCEi1nIoG9f2ALB5n3hQMg8I42j58VcUQo9gCUVKOQWIEsGtYOQZBX4CAIMMCx4wZAUGKvrEWJ7XZB4vxYSZBrrBZC4cSItxSQGGXPR8CZBX58heAZDZD";

    protected FacebookClientSingleton() {
        // Exists only to defeat instantiation.
    }
    public static FacebookClientSingleton getInstance() {
        if(instance == null) {
            System.setProperty("java.net.useSystemProxies", "true");
            instance = new FacebookClientSingleton();
            facebookClient = new DefaultFacebookClient(apiKey);
        }
        return instance;
    }

    public static List<FacebookStatus> getPosts(String query){
    try{
        return facebookClient.executeFqlQuery(query, FacebookStatus.class);
    }
    catch(Exception e){
        e.printStackTrace();
        return null;
        }
    }
}