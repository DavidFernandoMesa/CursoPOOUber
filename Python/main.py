from car import Car
if __name__  == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "MZTY05"
    car.driver = "David Arango";
    car.passengers = 4
    print(vars (car))
    
    car2 = Car()
    car2.license = "OPAE34"
    car2.driver = "Margarita Buitrago"
    car2.passengers = 4
    print(vars (car2))