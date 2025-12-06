package shape_task;

public interface Shape {

    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();


    default void printCharacteristics() {
        System.out.printf(
                " Характеристики %s \n" +
                        "  Периметр: %.2f\n" +
                        "  Площадь: %.2f\n" +
                        "  Цвет фона: %s\n" +
                        "  Цвет границ: %s\n",
                this.getClass().getSimpleName(),
                calculatePerimeter(),
                calculateArea(),
                getFillColor(),
                getBorderColor()
        );
    }
}