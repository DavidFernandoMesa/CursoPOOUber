from car import Car
from account import Account
from user import User
from uberX import UberX

if __name__ == "__main__":
    print("Car")
    car = Car("MZTY05", Account("David Arango", "DAV987"))
    car.passengers = 4
    print(vars(car))
    print(vars(car.driver))
    
    print("Car")
    car2 = Car("OPAE34", Account("Margarita Buitrago", "MGT354"))
    car2.passengers = 4
    print(vars(car2))
    print(vars(car.driver))
    
    print("User")
    user = User("David Fernando", "1058842242", "prueba@gmail.com", "4289")
    print(vars(user))
    
