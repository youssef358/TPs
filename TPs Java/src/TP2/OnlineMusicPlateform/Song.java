package TP2.OnlineMusicPlateform;

public class Song {
    private String title;
    private Artist artist;
    private String genre;
    private int length;

    public Song(String title, Artist artist, String genre, int length) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getLength() {
        return this.length;
    }

    public void playSong(){
        System.out.println("Playing " + this.title + " by " + this.artist.getName());
    }

    public void showSong(){
        System.out.println("Title: " + this.title);
        this.artist.showArtist();
        System.out.println("Genre: " + this.genre);
        System.out.println("Length: " + this.length);
    }


}
