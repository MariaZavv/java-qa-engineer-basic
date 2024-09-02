package service.impl;

import model.*;

public class AnimalFactory {

    public Animal create(AnimalType animalType) {
        return switch (animalType) {
            case CAT -> new Cat();
            case DOG -> new Dog();
            case DUCK -> new Duck();
        };

    }
}
