package facebook;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 16/11/13
 * Time: 19:20
 * To change this template use File | Settings | File Templates.
 */
public enum Query {
    getThreePosts("SELECT  message, time, status_id FROM status WHERE uid = 133322220051930  LIMIT 3"),
    getFourPosts("SELECT  message, time, status_id FROM status WHERE uid = 133322220051930  LIMIT 4");

    private final String query;

    Query(String query) {
        this.query = query;
    }

    public String getValue() {
        return query;
    }


}