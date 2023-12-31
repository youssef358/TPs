package TP2.Exercice2;

public class RubberDuck extends Duck implements Quackable {
    public void swim() {
        System.out.println("RubberDuck swim");
    }

    public void display() {
        System.out.println("I'm a RubberDuck");
    }

    public void quack() {
        System.out.println("RubberDuck quack");
    }
}
