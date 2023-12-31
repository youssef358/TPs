package TP2.OnlineMusicPlateform;

import java.util.ArrayList;

public class Artist {
    private String name;
    private int age;
    private ArrayList<Album> Albums;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
        this.Albums = new ArrayList<Album>();
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void addAlbum(Album a){
        this.Albums.add(a);
    }

    public void removeAlbum(Album a){
        this.Albums.remove(a);
    }

    public void showArtist(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Albums: ");
        for (Album a : this.Albums){
            a.showAlbum();
        }
    }







}
