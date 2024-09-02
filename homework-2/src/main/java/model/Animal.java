package model;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal() {}

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    public String toString() {
        return (String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s",
                name, age, defineAgeDeclension(), weight, color));

    }

    public String defineAgeDeclension() {
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);
        if (isExclusion) {
            return "лет";
        }

        int ageLastNumber = age % 10;

        if(ageLastNumber == 1) {
            return "год";
        } else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9) {
            return "лет";
        } else  {
            return "года";
        }
    }
}
