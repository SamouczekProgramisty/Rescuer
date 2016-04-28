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

    public Accident(String description, Position position, LocalDateTime date, AccidentStatus status) {
        this.description = description;
        this.position = position;
        this.date = date;
        this.status = status;
    }

    public Accident(String description) {
        this.description = description;
    }

    public static Accident instantiate(InputStream in) {
        if (in == System.in) {
            Scanner console = new Scanner(in);

            System.out.println("Podaj opis wypadkuu");
            String description = console.nextLine();

            System.out.println("Podaj pozycje lat wypadku");
            double lat = console.nextDouble();

            System.out.println("Podaj pozycje lon wypadku");
            double lon = console.nextDouble();

            Position position = new Position(lat, lon);

            LocalDateTime date = LocalDateTime.now();

            return new Accident(description, position, date, AccidentStatus.ACTIVE);
        }
        else
        {
            System.out.println("aaaa");
            return new Accident("blad");
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



    }
}
