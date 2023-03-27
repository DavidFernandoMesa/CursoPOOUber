<?php
require_once('Car.php');

class UberVan extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;
    protected $passengers;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    public function setPassenger($passengers) {
    
    if ($passengers == 6) {
        $this->passenger = $passengers;
    }
    else {
        echo "Numero de pasajeros no valido";
    }

}
}