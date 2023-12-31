package TP2.OnlineMusicPlateform;

import java.util.ArrayList;

public class PremiumUser {
    //same as Free User but without ads and without shuffle and with no limit of songs
    protected String UserID;
    protected ArrayList<Playlist> Playlists;


    public PremiumUser(String UserID){
        this.UserID = UserID;
        this.Playlists = new ArrayList<Playlist>();
    }

    public void listen(Song s){
        s.playSong();
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
        this.Playlists.add(new Playlist(p, (User) this));
    }

    public void showPlaylists(){
        for (Playlist playlist : this.Playlists){
            playlist.showPlaylist();
        }
    }

    public void listenPlaylist(String p){
        for (Playlist playlist : this.Playlists){
            if (playlist.getPlayListName().equals(p)){
                for (Song s : playlist.Songs){
                    s.playSong();
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
