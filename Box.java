package ru.gb.lesson4.hw;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    // Нужно реализовать хранение фрукто в коробке Box

    private List<T> fruitBox = new ArrayList<T>();

    public void add(T fruit) {
        fruitBox.add(fruit);
    }

    public double getWeight() {
        double weight = 0;
        for (T i : fruitBox) {
            weight += i.getWeight();    
        }
        return weight;
    }

    public void moveTo(Box<? super T> anotherBox) {
        for (int j = 0; j < fruitBox.size(); j++) {
            anotherBox.add(fruitBox.get(j));
        }
        fruitBox.clear();
    }

}
