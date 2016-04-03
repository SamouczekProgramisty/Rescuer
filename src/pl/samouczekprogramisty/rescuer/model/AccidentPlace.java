package pl.samouczekprogramisty.rescuer.model;

import java.time.LocalDate;

/**
 * Created by Maciek on 30.03.2016.
 */
public class AccidentPlace {
    private Position position;
    private String description;
    private LocalDate date;
    private AccidentStatus status;

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






}
