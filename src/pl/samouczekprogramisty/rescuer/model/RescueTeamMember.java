package pl.samouczekprogramisty.rescuer.model;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Maciek on 23.03.2016.
 */
public class RescueTeamMember {
    Position position;
    LocalTime lastUpdated;
    String name;
    String surname;
    String phoneNumber:;
    List<Activity> activityLog = new ArrayList<Activity>();

}
