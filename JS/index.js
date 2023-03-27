var car = new Car("AWS44", new Account("Andres Arango", "ANDY871"));
car.passengers = 4;
car.printDataCar();

var uberX = new UberX(
  "JK57",
  new Account("David Fernando", "JKL845"),
  "Chevrolet",
  "Spark"
);
uberX.passengers = 5;
uberX.printDataCar();

var uberPool = new UberPool(
  "FGY88",
  new Account("Jose Arango", "JRG5478"),
  "Chevrolet",
  "Spark"
);
uberPool.passengers = 4;
uberPool.printDataCar();

var user = new User(
  "Gustavo Andres",
  "648957",
  "gustavo@hotmail.com",
  "54782"
);
user.PrintDataUser();
