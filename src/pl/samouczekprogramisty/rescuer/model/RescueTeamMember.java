package pl.samouczekprogramisty.rescuer.model;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Maciek on 23.03.2016.
 */
public class RescueTeamMember {
    private Position position;
    private LocalTime lastUpdated;
    private String name;
    private String surname;
    private String phoneNumber;
    private List<Activity> activityLog = new ArrayList<Activity>();

    public RescueTeamMember(Position position, LocalTime lastUpdated, String name, String surname, String phoneNumber) {
        this.position = position;
        this.lastUpdated = lastUpdated;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public Position getPosition() {
        return position;
    }

    public LocalTime getLastUpdated() {
        return lastUpdated;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Activity> getActivityLog() {
        return activityLog;
    }

}
