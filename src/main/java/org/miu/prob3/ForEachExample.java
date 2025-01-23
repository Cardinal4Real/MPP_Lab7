package org.miu.prob3;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public ForEachExample() {
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation", "Everywhere you want to be");
        //Consumer is argument for the "forEach" method
        list.forEach(e-> System.out.println(e.toUpperCase()));
    }
}
