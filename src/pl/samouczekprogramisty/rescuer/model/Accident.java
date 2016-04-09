package pl.samouczekprogramisty.rescuer.model;

import java.time.LocalDate;

/**
 * Created by Maciek on 30.03.2016.
 */
public class Accident {
    private Position position;
    private String description;
    private LocalDate date;
    private AccidentStatus status;
    private RescueTeamMember rescuer;

    public Accident(Position position, String description, LocalDate date, AccidentStatus status, RescueTeamMember rescuer) {
        this.position = position;
        this.description = description;
        this.date = date;
        this.status = status;
        this.rescuer = rescuer;
    }

    public enum AccidentStatus {
        ACTIVE, ASSIGEND, CLOSED
    }

    public Position getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public AccidentStatus getStatus() {
        return status;
    }

    public RescueTeamMember getRescuer() {
        return rescuer;
    }
}
