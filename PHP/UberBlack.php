<?php
require_once('Car.php');

class UberBlack extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}