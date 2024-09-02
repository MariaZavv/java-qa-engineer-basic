package service.impl;

import model.Animal;
import model.AnimalType;
import model.CommandType;
import service.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {

    private final AnimalFactory animalFactory = new AnimalFactory();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {
        List<Animal> animals = new ArrayList<>();

        while (true) {
            CommandType command = tryGetCommand();
            switch (command) {
                case ADD: {
                    AnimalType animalType = tryGetAnimal();
                    Animal animal = createAnimal(animalType);
                    animals.add(animal);
                    animal.say();
                    break;
                }
                case LIST: {
                    for (Animal animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                }
                case EXIT: {
                    System.exit(0);
                }
            }
        }
    }

    private CommandType tryGetCommand() {
        List<String> commands = CommandType.names();

        while (true) {
            System.out.println("Введите команду add/list/exit");
            String command = scanner.next().toUpperCase(Locale.ROOT);
            boolean correct = commands.contains(command);
            if (!correct) {
                System.out.printf("Команда %s не поддерживаетя %n", command);
            } else {
                return CommandType.valueOf(command);
            }
        }
    }

    private AnimalType tryGetAnimal() {
        List<String> animals = AnimalType.names();

        while (true) {
            System.out.println("Введите тип животного: cat, dog, duck");
            String animal = scanner.next().toUpperCase(Locale.ROOT);
            boolean correct = animals.contains(animal);
            if (!correct) {
                System.out.printf("Животное %s не существует %n", animal);
            } else {
                return AnimalType.valueOf(animal);
            }
        }
    }

    private Animal createAnimal(AnimalType type) {
        System.out.println("Введите имя животного");
        String name = scanner.next();
        int age = tryGetInteger("Введите возраст животного");
        int weight = tryGetInteger("Введите вес животного");
        System.out.println("Введите цвет животного");
        String color = scanner.next();

        Animal animal = animalFactory.create(type);
        animal.setName(name);
        animal.setAge(age);
        animal.setWeight(weight);
        animal.setColor(color);
        return animal;
    }

    private Integer tryGetInteger(String msg) {
        while (true) {
            System.out.println(msg);
            scanner.nextLine();
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите целое число");
            }
        }
    }
}
