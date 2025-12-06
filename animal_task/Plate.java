package animal_task;

public class Plate {
    private int foodAmount;

    public Plate(int initialFood) {
        this.foodAmount = (initialFood < 0) ? 0 : initialFood;
        System.out.printf("Создана миска с %d еды.\n", this.foodAmount);
    }

    public boolean decreaseFood(int amount) {

        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.printf("В миску добавлено %d еды. Текущее количество: %d.\n", amount, foodAmount);
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}