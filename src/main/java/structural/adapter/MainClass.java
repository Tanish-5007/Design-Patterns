package structural.adapter;

public class MainClass {
    public static void main(String[] args) {
        ClientPlayer clientPlayer = new ClientPlayer();

        clientPlayer.play("mp4", "alone.mp4");
        clientPlayer.play("vlc", "away.vlc");
        clientPlayer.play("avi", "avi_music.avi");
    }
}
