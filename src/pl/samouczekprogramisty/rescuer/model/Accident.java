package pl.samouczekprogramisty.rescuer.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Date;
import java.io.*;



/**
 * Created by Maciek on 30.03.2016.
 */
public class Accident {
    private Position position;
    private String description;
    private LocalDateTime date;
    private AccidentStatus status;
    private RescueTeamMember rescuer;


    public Accident() {

    }

    public Accident(String description) {
        this.description = description;
    }

    public static Accident instantiate(InputStream in) {
        if (in == System.in) {
            Scanner console = new Scanner(in);
            System.out.println("podaj opis wypadkuu");
            String description = console.nextLine();
            return new Accident(description);
        }
        else
        {
            System.out.println("aaaa");
            return new Accident("dupa");
        }

    }

    public Position getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public RescueTeamMember getRescuer() {
        return rescuer;
    }

    public void assignRescueTeamMember(RescueTeamMember rescuer) {
        this.rescuer = rescuer;
    }

    public void enterAccidentDetails() {
        /*Scanner console = new Scanner(System.in);

        System.out.println("Podaj pozycje lat wypadku");
        double lat = console.nextDouble();

        System.out.println("Podaj pozycje lon wypadku");
        double lon = console.nextDouble();

        Position position = new Position(lat, lon);
        this.position = position;


        System.out.println("Podaj opis wypadku: ");
        String description = console.nextLine();
        this.description = description;

        LocalDateTime date = LocalDateTime.now();
        this.date = date;

        this.status = AccidentStatus.ACTIVE;*/


    }
}
