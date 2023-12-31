package TP2.OnlineMusicPlateform;

import java.util.ArrayList;

public class FreeUser implements User{
    //Free user can listen to a song out of a playlist only 100 times
    //after every Song he will listen to an Add
    protected String UserID;
    protected ArrayList<Playlist> Playlists;

    protected static int onesongcount = 100;

    protected ArrayList<String> ADS;

    public FreeUser(String UserID){
        this.UserID = UserID;
        this.Playlists = new ArrayList<Playlist>();
        this.ADS = new ArrayList<String>();
        for (int i = 0; i < 1000; i++){
            this.ADS.add("AD" + i);
        }
    }

    public void listen(Song s){
        s.playSong();
        System.out.println("AD: " + this.ADS.get(0));
        this.ADS.remove(0);
        this.onesongcount--;

    }

    public void addPlaylist(Playlist p){
        this.Playlists.add(p);
    }

    public void removePlaylist(Playlist p){
        this.Playlists.remove(p);
    }

    public void addToPlaylist(Song s, String p){
        for (Playlist playlist : this.Playlists){
            if (playlist.getPlayListName().equals(p)){
                playlist.addSong(s);
                return;
            }
        }
        System.out.println("Playlist not found");
    }

    public void removeFromPlaylist(Song s, String p){
        for (Playlist playlist : this.Playlists){
            if (playlist.getPlayListName().equals(p)){
                playlist.removeSong(s);
                return;
            }
        }
        System.out.println("Playlist not found");
    }

    public void createPlaylist(String p){
        for (Playlist playlist : this.Playlists){
            if (playlist.getPlayListName().equals(p)){
                System.out.println("Playlist already exists");
                return;
            }
        }
        this.Playlists.add(new Playlist(p, this));
    }

    public void showPlaylists(){
        for (Playlist playlist : this.Playlists){
            playlist.showPlaylist();
        }
    }

    public void listenPlaylist(String p){
        for (Playlist playlist : this.Playlists){
            if (playlist.getPlayListName().equals(p)){
                playlist.shuffle();
                for (Song s : playlist.Songs){
                    s.playSong();
                    System.out.println("AD: " + this.ADS.get(0));
                    this.ADS.remove(0);
                }
                return;
            }
        }
        System.out.println("Playlist not found");
    }

    public void showPlaylist(String p){
        for (Playlist playlist : this.Playlists){
            if (playlist.getPlayListName().equals(p)){
                playlist.showPlaylist();
                return;
            }
        }
        System.out.println("Playlist not found");
    }

    public void showUser(){
        System.out.println("User ID: " + this.UserID);
        System.out.println("Playlists: ");
        for (Playlist playlist : this.Playlists){
            playlist.showPlaylist();
        }
    }




}
