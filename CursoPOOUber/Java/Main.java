class Main {
    public static void main(String[] args){
        Car car = new Car("ABC123", new Account("Andrés Herrera", "and123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("DEF456", new Account("Andrea Acosta", "and456"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}