package pl.samouczekprogramisty.rescuer.model;
import java.io.Console;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {


        RescueTeamMember rescuer1 = RescueTeamMember.instantiate(System.in);

        Accident accident = Accident.instantiate(System.in);

        accident.assignRescueTeamMember(rescuer1);

        System.out.println(accident.getRescuer().getName());
        System.out.println(accident.getRescuer().getPhoneNumber());
        System.out.println(accident.getDescription());
        System.out.println(accident.getPosition().getLat());
        System.out.println(accident.getPosition().getLon());


    }
}
