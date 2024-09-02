package model;

public class Dog extends Animal {

    public Dog() {}

    public Dog(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

        @Override
        public void say() {
            System.out.println("Гав");
        }
}
