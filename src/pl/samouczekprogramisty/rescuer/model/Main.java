package pl.samouczekprogramisty.rescuer.model;
import java.io.Console;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        RescueTeamMember rescuer1 = new RescueTeamMember();
        RescueTeamMember rescuer2 = new RescueTeamMember();

        String name = console.nextLine("Podaj imie ratownika : ");
        rescuer1.setName(name);

        String surname = console.nextLine("Podaj nazwisko ratownika : ");
        rescuer1.setSurname(surname);

        String phoneNumber = console.nextLine("Podaj nr telefonu ratownika : ");
        rescuer1.setPhoneNumber(phoneNumber);

        double lat = console.nextDouble("Podaj pozycje lat ratownika");

        double lon = console.nextDouble("Podaj pozycje lon ratownika");

        Position position = new Position(lat, lon);
        rescuer1.setPosition(position);

        LocalTime lastUpdated = LocalTime.now();
        rescuer1.setLastUpdated(lastUpdated);

        //RescueTeamMember rescuer1 = new RescueTeamMember(position, lastUpdated, name, surname, phoneNumber );


        //duplikacja kodu
        name = console.nextLine("Podaj imie ratownika : ");
        rescuer2.setName(name);

        surname = console.nextLine("Podaj nazwisko ratownika : ");
        rescuer2.setSurname(surname);

        phoneNumber = console.nextLine("Podaj nr telefonu ratownika : ");
        rescuer2.setPhoneNumber(phoneNumber);

        lat = console.nextDouble("Podaj pozycje lat ratownika");

        lon = console.nextDouble("Podaj pozycje lon ratownika");

        position = new Position(lat, lon);
        rescuer2.setPosition(position);

        lastUpdated = LocalTime.now();
        rescuer2.setLastUpdated(lastUpdated);



        // Position
        Position position = console.nextLine("Podaj wspolrzedne wypadku : ");
        String description = console.nextLine("Podaj opis wypadku : ");
        LocalDate date = LocalDate.now();
        AccidentPlace.AccidentStatus status = AccidentPlace.AccidentStatus.ACTIVE;
        LocalTime lastUpdated = LocalTime.now();

        AccidentPlace accidentPlace = new AccidentPlace(position, description, date, status, rescuer1);




    }
}
