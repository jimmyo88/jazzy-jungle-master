package facebook;

import com.restfb.Facebook;
import utility.DateFormatter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 16/11/13
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
public class FacebookStatus {

    @Facebook
        String message;

    @Facebook
        Integer time;

    @Facebook
        String status_id;

    public String getStatus_id() {
        return "https://www.facebook.com/jazzyjunglecardiff/posts/" + status_id;
    }

    public void setStatus_id(String status_id) {
        this.status_id = status_id;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getMessage() {
    if(message.length() >= 90)
        return message.substring(0,90) + "...";
    else return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return DateFormatter.getLongDateFromUnixTime(time);
    }

    @Override
        public String toString() {
            return String.format("Message: %s,time: %s", message, time);
        }
}

