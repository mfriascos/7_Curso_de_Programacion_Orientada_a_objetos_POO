from car import Car


if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car()
    car.license = "GHI789"
    car.driver = "Andrés Herrera"
    print(vars(car))

    car2= Car()
    car2.license = "JKL012"
    car2.driver = "Andrea Herrera"
    print(vars(car2))
    