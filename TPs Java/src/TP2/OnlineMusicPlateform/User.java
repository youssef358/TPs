package TP2.OnlineMusicPlateform;

public interface User {
    public void listen(Song s);
    public void addToPlaylist(Song s , String name);
    public void removeFromPlaylist(Song s, String name);
    public void showPlaylist(String name);

}
