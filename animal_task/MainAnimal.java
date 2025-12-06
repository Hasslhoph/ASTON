package animal_task;

public class MainAnimal {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобик");
        Cat catMurka = new Cat("Мурка", 15);
        Dog dogBars = new Dog("Барс");

        System.out.println("Тестирование действий");
        dogBobik.run(150);
        catMurka.run(300);
        dogBars.swim(20);
        catMurka.swim(1);

        System.out.println("\n Подсчет животных");
        System.out.printf("Общее количество животных: %d\n", Animal.getAnimalCount());
        System.out.printf("Количество собак: %d\n", Dog.getDogCount());
        System.out.printf("Количество котов: %d\n", Cat.getCatCount());

        System.out.println("\n Кормление котов");
        Cat[] hungryCats = {
                new Cat("Васька", 10),
                new Cat("Рыжик", 5),
                new Cat("Зевс", 20)
        };

        Plate plate = new Plate(25);

        for (Cat cat : hungryCats) {
            cat.eat(plate);
        }

        System.out.println("\n Результат кормления");
        for (Cat cat : hungryCats) {
            cat.printSatiety();
        }

        plate.addFood(15);
        hungryCats[2].eat(plate);

        System.out.println("\n Окончательный результат");
        hungryCats[2].printSatiety();
    }
}