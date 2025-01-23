package org.miu.prob4;

public interface Quackable {
    default void quack() {
        System.out.println("  quacking");
    }
}
