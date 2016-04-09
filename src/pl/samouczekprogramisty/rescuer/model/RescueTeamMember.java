package pl.samouczekprogramisty.rescuer.model;
import java.time.LocalTime;
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.io.Console;
import java.time.LocalDate;



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
        //this.activityLog = activityLog;
    }
    public RescueTeamMember() {

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

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setLastUpdated(LocalTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setActivityLog(List<Activity> activityLog) {
        this.activityLog = activityLog;
    }

    public void enterDetails() {
        Scanner console = new Scanner(System.in);
        System.out.println("Podaj imie ratownika1: ");
        String name = console.nextLine();
        this.setName(name);

        System.out.println("Podaj nazwisko ratownika: ");
        String surname = console.nextLine();
        this.setSurname(surname);

        System.out.println("Podaj nr telefonu ratownika : ");
        String phoneNumber = console.nextLine();
        this.setPhoneNumber(phoneNumber);

        System.out.println("Podaj pozycje lat ratownika");
        double lat = console.nextDouble();

        System.out.println("Podaj pozycje lon ratownika");
        double lon = console.nextDouble();

        Position position = new Position(lat, lon);
        this.setPosition(position);

        LocalTime lastUpdated = LocalTime.now();
        this.setLastUpdated(lastUpdated);
    }
}
