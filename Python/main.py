from car import Car
from account import Account
if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("MZTY05", Account("David Arango", "DAV987"))
    car.passengers = 4
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("OPAE34", Account("Margarita Buitrago", "MGT354"))
    car2.passengers = 4
    print(vars(car2))
    print(vars(car.driver))
