package pl.samouczekprogramisty.rescuer.model;
import java.time.LocalTime;
import java.util.Date;

/**
 * Created by Maciek on 23.03.2016.
 */
public class Activity {

    private Date begin;
    private Date end;


    public Activity (Date begin, Date end) {
        this.begin = begin;
        this.end = end;
    }

    public Activity() {

    }

    public Date getBegin() {
        return begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setBegin() {
        Date date = new Date();
        this.begin = date;
    }

    public void setEnd(Date end) {
        Date date = new Date();
        this.end = end;
    }


}
