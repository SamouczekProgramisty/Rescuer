package pl.samouczekprogramisty.rescuer.model;
import java.io.Console;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Console console = System.console();
        RescueTeamMember rescuer1 = new RescueTeamMember();
        RescueTeamMember rescuer2 = new RescueTeamMember();

        String name = console.readLine("Podaj imie ratownika : ");
        String surname = console.readLine("Podaj nazwisko ratownika : ");
        String phoneNumber = console.readLine("Podaj nr telefonu ratownika : ");
        //Position position = console.readLine("Podaj pozycje ratownika lat, lon ");
        rescuer1.setLat(keyboard.nextDouble("Podaj pozycje lat ratownika"));
        rescuer1.setLon(keyboard.nextDouble("Podaj pozycje lat ratownika"));

        LocalTime lastUpdated = LocalTime.now();

        RescueTeamMember rescuer1 = new RescueTeamMember(position, lastUpdated, name, surname, phoneNumber );


        //duplikacja kodu
        String name = console.readLine("Podaj imie ratownika : ");
        String surname = console.readLine("Podaj nazwisko ratownika : ");
        String phoneNumber = console.readLine("Podaj nr telefonu ratownika : ");
        position = console.readLine("Podaj pozycje ratownika lat, lon ");
        LocalTime lastUpdated = LocalTime.now();

        RescueTeamMember rescuer2 = new RescueTeamMember(position, lastUpdated, name, surname, phoneNumber );


        Position position = console.readLine("Podaj wspolrzedne wypadku : ");
        String description = console.readLine("Podaj opis wypadku : ");
        LocalDate date = LocalDate.now();
        AccidentPlace.AccidentStatus status = AccidentPlace.AccidentStatus.ACTIVE;
        LocalTime lastUpdated = LocalTime.now();

        AccidentPlace accidentPlace = new AccidentPlace(position, description, date, status, rescuer1);




    }
}
