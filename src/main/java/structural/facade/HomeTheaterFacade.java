package structural.facade;

public class HomeTheaterFacade {

    private final DVDPlayer dvdPlayer;
    private final Amplifier amplifier;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        amplifier.off();
    }
}