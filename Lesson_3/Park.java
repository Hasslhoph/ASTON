public class Park {
    public String parkName;
    public String location;
    public Attraction[] attractions;

    public Park(String parkName, String location) {
        this.parkName = parkName;
        this.location = location;
        this.attractions = new Attraction[0];
    }


    public class Attraction {
        public String attractionName;
        public String workTime;
        public double price;


        public Attraction(String attractionName, String workTime, double price) {
            this.attractionName = attractionName;
            this.workTime = workTime;
            this.price = price;
        }


        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workTime);
            System.out.println("Стоимость: " + price + " руб.");
        }


    }


    public void addAttraction(String name, String time, double price) {
        Attraction newAttraction = new Attraction(name, time, price);

        Attraction[] newArray = new Attraction[attractions.length + 1];
        for (int i = 0; i < attractions.length; i++) {
            newArray[i] = attractions[i];
        }
        newArray[attractions.length] = newAttraction;
        attractions = newArray;
    }

    public void printParkInfo() {
        System.out.println("=== ПАРК '" + parkName + "' ===");
        System.out.println("Местоположение: " + location);
        System.out.println("Количество аттракционов: " + attractions.length);
        System.out.println("------------------------");

        for (int i = 0; i < attractions.length; i++) {
            System.out.println("Аттракцион " + (i + 1) + ":");
            attractions[i].printAttractionInfo();
            System.out.println();
        }
    }

}