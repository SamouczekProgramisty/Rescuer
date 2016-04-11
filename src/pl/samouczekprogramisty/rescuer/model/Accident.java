package pl.samouczekprogramisty.rescuer.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Date;



/**
 * Created by Maciek on 30.03.2016.
 */
public class Accident {
    private Position position;
    private String description;
    private LocalTime date;
    private AccidentStatus status;
    private RescueTeamMember rescuer;

    public Accident(Position position, String description, LocalTime date, AccidentStatus status, RescueTeamMember rescuer) {
        this.position = position;
        this.description = description;
        this.date = date;
        this.status = status;
        this.rescuer = rescuer;
    }

    public Accident() {

    }

    public Position getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public RescueTeamMember getRescuer() {
        return rescuer;
    }

    public void AssignRescueTeamMember(RescueTeamMember rescuer) {
        this.rescuer = rescuer;
    }

    public void enterAccidentDetails() {
        Scanner console = new Scanner(System.in);

        System.out.println("Podaj pozycje lat wypadku");
        double lat = console.nextDouble();

        System.out.println("Podaj pozycje lon wypadku");
        double lon = console.nextDouble();

        Position position = new Position(lat, lon);
        this.position = position;


        System.out.println("Podaj opis wypadku: ");
        String description = console.nextLine();
        this.description = description;

        LocalTime date = LocalTime.now();
        this.date = date;

        this.status = AccidentStatus.ACTIVE;


    }
}
