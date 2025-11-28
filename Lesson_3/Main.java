public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Телевизор", "2025-01-10", "Samsung", "Корея", 45000.0, false);
        product1.printInfo();
        System.out.println(" ");

        Product product2 = new Product("Холодильник", "2024-03-20", "LG", "Китай", 32000.0, true);
        product2.printInfo();
        System.out.println(" ");

        Product product3 = new Product("Телефон", "2025-02-19", "Iphone", "USA",98000.0, false);
        product3.printInfo();
        System.out.println(" ");

        Product product4 = new Product("Телефон", "2025-02-19", "Сяоми", "Китай",18000.0, false);
        product4.printInfo();
        System.out.println(" ");

        Product product5 = new Product("Телефон", "2025-02-19", "Pixel", "USA",86000.0, false);
        product5.printInfo();
        System.out.println(" ");

        Product[] productsArray = new Product[5];
        productsArray[0] = product1;
        productsArray[1] = product2;
        productsArray[2] = product3;
        productsArray[3] = product4;
        productsArray[4] = product5;

        System.out.println("Товары из массива");
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар " + (i + 1) + " в массиве:");
            productsArray[i].printInfo();
            System.out.println(" ");

        }

        Park park = new Park("Парк Горького", "Москва");
        park.addAttraction("Колесо обозрения", "10:00-22:00", 300);

        System.out.println("Название парка: " + park.parkName);
        System.out.println("Город: " + park.location);
        System.out.println("Количество аттракционов: " + park.attractions.length);

        Park.Attraction first = park.attractions[0];
        System.out.println("Первый аттракцион: " + first.attractionName);
        System.out.println("Цена: " + first.price);


    }
}