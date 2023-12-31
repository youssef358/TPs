package TP2.Exercice2;

public class MallardDuck extends Duck implements Flyable, Quackable {
    public void swim() {
        System.out.println("MallardDuck swim");
    }

    public void display() {
        System.out.println("I'm a MallardDuck");
    }

    public void fly() {
        System.out.println("MallardDuck fly");
    }

    public void quack() {
        System.out.println("MallardDuck quack");
    }

}
