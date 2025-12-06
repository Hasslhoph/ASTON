package animal_task;

public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    private static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        System.out.print(name);
        if (distance > runLimit) {
            System.out.printf(" не смог пробежать %d м. (лимит: %d м.).\n", distance, runLimit);
        } else {
            System.out.printf(" успешно пробежал %d м.\n", distance);
        }
    }

    public void swim(int distance) {
        System.out.print(name);
        if (swimLimit == 0) {
            System.out.println(" не умеет плавать.");
        } else if (distance > swimLimit) {
            System.out.printf(" не смог проплыть %d м. (лимит: %d м.).\n", distance, swimLimit);
        } else {
            System.out.printf(" успешно проплыл %d м.\n", distance);
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}