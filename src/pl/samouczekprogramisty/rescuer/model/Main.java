package pl.samouczekprogramisty.rescuer.model;
import java.io.Console;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        //RescueTeamMember rescuer1 = new RescueTeamMember();
        //RescueTeamMember rescuer2 = new RescueTeamMember();
        //Accident accident = new Accident();

        RescueTeamMember rescuer1 = RescueTeamMember.instantiate(System.in);

        Accident accident = Accident.instantiate(System.in);

        //rescuer1.enterDetails();
        rescuer2.enterDetails();

        //accident.enterAccidentDetails();
        accident.assignRescueTeamMember(rescuer1);

        System.out.println(accident.getRescuer().getName());
        System.out.println(accident.getDescription());

    }
}
