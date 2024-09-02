package model;

import java.util.Arrays;
import java.util.List;

public enum AnimalType {
    CAT, DOG, DUCK;

    public static List<String> names() {
        return Arrays.stream(values()).map(AnimalType::name).toList();
    }
}
