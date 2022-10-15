from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("AW2345",Account("Hola Python","12345678"))
    print(vars(car))
    print(vars(car.driver))