<?php
require_once('Account.php');
    class Car{
        $id = int;
        $license = string;
        $driver = string;
        protected $passengers = int;

        public fucntion __construct($license, $driver){
            $this->license = $license;
            $this->driver = $driver
        }

        public function printDataCar(){
            echo "license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
        }

        public function printDataCar() {
        echo "Licencia: $this->license, Driver: {$this->driver->name}, Número de pasajeros: $this->passenger";
        }

        public function getPassenger() {
        return $this->passengers;
        }
        public function setPassenger($passengers) {
        
        if ($passengers == 4) {
        $this->passengers = $passengers;
        }
        else {
        echo "Necesitas asignar 4 pasajeros";
        }

        }
    }
?>