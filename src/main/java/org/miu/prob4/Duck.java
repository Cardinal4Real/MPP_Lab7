package org.miu.prob4;

public abstract class Duck implements Flyable, Quackable {
    public Duck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println("  swimming");
    }
}
