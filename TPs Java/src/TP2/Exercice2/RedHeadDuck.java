package TP2.Exercice2;

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    public void swim() {
        System.out.println("RedHeadDuck swim");
    }

    public void display() {
        System.out.println("I'm a RedHeadDuck");
    }

    public void fly() {
        System.out.println("RedHeadDuck fly");
    }

    public void quack() {
        System.out.println("RedHeadDuck quack");
    }
}
