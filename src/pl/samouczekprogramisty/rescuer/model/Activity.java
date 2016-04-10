package pl.samouczekprogramisty.rescuer.model;
import java.time.LocalTime;

/**
 * Created by Maciek on 23.03.2016.
 */
public class Activity {

    private LocalTime begin;
    private LocalTime end;

    public Activity (LocalTime begin, LocalTime end) {
        this.begin = begin;
        this.end = end;
    }

    public LocalTime getBegin() {
        return begin;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setBegin(LocalTime begin) {
        this.begin = begin;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }


}
