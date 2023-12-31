package TP2.OnlineMusicPlateform;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    protected String PlayListName;
    protected ArrayList<Song> Songs;
    protected User user;

    public Playlist(String PlayListName, User user){
        this.PlayListName = PlayListName;
        this.Songs = new ArrayList<Song>();
        this.user = user;
    }



    public void addSong(Song s){
        for (Song song : this.Songs){
            if (song.getTitle().equals(s.getTitle())){
                System.out.println("Song already exists in the PlayList");
                return;
            }
        }
        this.Songs.add(s);
    }

    public void removeSong(Song s){
        this.Songs.remove(s);
    }

    public void playSongFromPlaylist(String title){
        for (Song s : this.Songs){
            if (s.getTitle().equals(title)){
                s.playSong();
                return;
            }
        }
        System.out.println("Song not found");
    }

    public void showPlaylist(){
        System.out.println("Playlist: " + this.PlayListName);
        System.out.println("Songs: ");
        for (Song s : this.Songs){
            s.showSong();
        }
    }

    public void shuffle(){
        Collections.shuffle(this.Songs);
    }


    public String getPlayListName() {
        return this.PlayListName;
    }
}
