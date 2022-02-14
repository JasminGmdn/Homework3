package Task2;

public class Vehicle {
    private static double cost;
    private static int speed;
    private static int year;

    public Vehicle(double cost, int speed, int year){
        this.cost = cost;
        this.speed = speed;
        this.year = year;
    }

    public static void main(String[] args) {
        Plane vehicle1 = new Plane(1000, 255, 2017);
        vehicle1.show();
        Car vehicle2 = new Car(6571, 110, 2020);
        vehicle2.show();
        Ship vehicle3 = new Ship(200000, 235,2010);
        vehicle3.show();

    }

    static class Plane extends Vehicle{

        int amount = 2000;
        double height = 315;

        public Plane(double cost, int speed, int year) {
            super(cost , speed, year);

        }
        void show(){
            System.out.println("Plane: " + cost + "$; " + speed + "km/h; " + year + "y.; " + amount + "; "
                    + height + "m. ");
        }
    }

    static class Car extends Vehicle{

        public Car(double cost, int speed, int year) {

            super(cost, speed, year);
        }
        void show(){

            System.out.println("Car: " + cost + "$; " + speed + "km/h; " + year + "y. ");
        }
    }

    static class Ship extends Vehicle{

        String port = "Порт Одесса";
        int amount = 2000;

        public Ship(double cost, int speed, int year) {
            super(cost, speed, year);
        }
        void show(){
            System.out.println("Ship: " + cost + "$; " + speed +
                    "km/h; " + year + "y.; " + amount + "; " + port + ". ");
        }
    }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }


    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

}
