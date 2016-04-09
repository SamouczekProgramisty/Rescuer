package pl.samouczekprogramisty.rescuer.model;
import java.io.Console;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        RescueTeamMember rescuer1 = new RescueTeamMember();
        RescueTeamMember rescuer2 = new RescueTeamMember();
        Accident accident = new Accident();

        rescuer1.enterDetails();
        rescuer2.enterDetails();

        accident.enterAccidentDetails();
        
    }
}
