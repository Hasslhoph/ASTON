package shape_task;

public class MainShape {
    public static void main(String[] args) {

        System.out.println("Задание 2: Расчет фигур");

        Shape circle = new Circle(5.0, "Синий", "Желтый");
        Shape rectangle = new Rectangle(4.0, 6.0, "Красный", "Белый");
        Shape triangle = new Triangle(3.0, 4.0, 5.0, "Зеленый", "Черный");


        circle.printCharacteristics();
        rectangle.printCharacteristics();
        triangle.printCharacteristics();
    }
}