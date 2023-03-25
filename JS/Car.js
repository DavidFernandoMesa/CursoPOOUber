class Car {
  constructor(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passengers;
  }

  printDataCar = () => {
    //Imprime todos los datos en una tabla
    console.table(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
  };
}
