package structural.facade;

public class Main {

    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        Amplifier amplifier = new Amplifier();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, amplifier);

        homeTheater.watchMovie("Inception");
        System.out.println("\nMovie is over...\n");
        homeTheater.endMovie();

    }

}
