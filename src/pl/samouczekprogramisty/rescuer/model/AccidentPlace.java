package pl.samouczekprogramisty.rescuer.model;

import java.time.LocalDate;

/**
 * Created by Maciek on 30.03.2016.
 */
public class AccidentPlace {
    Position position;
    String description;
    LocalDate date;
    AccidentStatus status;

    public enum AccidentStatus {
        ACTIVE, ASSIGEND, CLOSED
    }

}
