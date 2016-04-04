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

        System.out.println("Podaj imie ratownika: ");
        String name = console.nextLine();
        rescuer1.setName(name);

        System.out.println("Podaj nazwisko ratownika: ");
        String surname = console.nextLine();
        rescuer1.setSurname(surname);

        System.out.println("Podaj nr telefonu ratownika : ");
        String phoneNumber = console.nextLine();
        rescuer1.setPhoneNumber(phoneNumber);

        System.out.println("Podaj pozycje lat ratownika");
        double lat = console.nextDouble();

        System.out.println("Podaj pozycje lon ratownika");
        double lon = console.nextDouble();

        Position position = new Position(lat, lon);
        rescuer1.setPosition(position);

        LocalTime lastUpdated = LocalTime.now();
        rescuer1.setLastUpdated(lastUpdated);

        //RescueTeamMember rescuer1 = new RescueTeamMember(position, lastUpdated, name, surname, phoneNumber );


        //duplikacja kodu
        System.out.println("Podaj imie ratownika: ");
        name = console.nextLine();
        rescuer2.setName(name);

        System.out.println("Podaj nazwisko ratownika: ");
        surname = console.nextLine();
        rescuer2.setSurname(surname);

        System.out.println("Podaj nr telefonu ratownika : ");
        phoneNumber = console.nextLine();
        rescuer2.setPhoneNumber(phoneNumber);

        System.out.println("Podaj pozycje lat ratownika");
        lat = console.nextDouble();

        System.out.println("Podaj pozycje lon ratownika");
        lon = console.nextDouble();

        position = new Position(lat, lon);
        rescuer2.setPosition(position);

        lastUpdated = LocalTime.now();
        rescuer2.setLastUpdated(lastUpdated);



        // Position
        //position = console.nextLine("Podaj wspolrzedne wypadku : ");
        //String description = console.nextLine("Podaj opis wypadku : ");
        //LocalDate date = LocalDate.now();
        //AccidentPlace.AccidentStatus status = AccidentPlace.AccidentStatus.ACTIVE;
        //LocalTime lastUpdated = LocalTime.now();

        //AccidentPlace accidentPlace = new AccidentPlace(position, description, date, status, rescuer1);




    }
}
