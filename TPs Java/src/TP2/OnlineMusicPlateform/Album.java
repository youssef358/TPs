package TP2.OnlineMusicPlateform;

import java.util.ArrayList;

public class Album {
    protected ArrayList<Song> songs;
    protected String name;
    protected String artist;
    protected String genre;

    public Album (String name, String artist, String genre){
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song s){
        this.songs.add(s);
    }

    public void removeSong(Song s){
        this.songs.remove(s);
    }

    public void playSongFromAlbum(String title){
        for (Song s : this.songs){
            if (s.getTitle().equals(title)){
                s.playSong();
                return;
            }
        }
        System.out.println("Song not found");
    }

    public void showAlbum(){
        System.out.println("Album: " + this.name);
        System.out.println("Artist: " + this.artist);
        System.out.println("Genre: " + this.genre);
        System.out.println("Songs: ");
        for (Song s : this.songs){
            s.showSong();
        }
    }


}
