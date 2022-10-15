class Car {
    Integer id;         //Atributos   
    String license;     //Atributos
    Account driver;      //Atributos
    Integer passenger;  //Atributos

    //Método Constructor
    public Car(String license, Account driver){     //Asignamos los parametros obligatorios para
        this.license = license;                     //Para nuestro método constructor
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + "\nDriver: " + driver.name);  // Método para Imprimir
    }                                                                           //Todas las variables
           
}
