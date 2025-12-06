package animal_task;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety;
    private final int eatAmount;

    public Cat(String name, int requiredFood) {
        super(name, 200, 0);
        this.satiety = false;
        this.eatAmount = requiredFood;
        catCount++;
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.printf("Кот %s уже сыт.\n", name);
            return;
        }

        System.out.printf("Кот %s пытается съесть %d еды. В миске: %d.\n",
                name, eatAmount, plate.getFoodAmount());

        if (plate.decreaseFood(eatAmount)) {
            this.satiety = true;
            System.out.printf(" -> Успех! Кот %s сыт. В миске осталось %d еды.\n",
                    name, plate.getFoodAmount());
        } else {
            System.out.printf(" -> Неудача. Еды в миске (%d) мало для %s (%d нужно).\n",
                    plate.getFoodAmount(), name, eatAmount);
        }
    }

    public void printSatiety() {
        String status = satiety ? "сыт" : "голоден";
        System.out.printf("Кот %s: %s.\n", name, status);
    }

    public static int getCatCount() {
        return catCount;
    }
}