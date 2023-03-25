<?php
require_once('Account.php');
    class Car{
        $id = int;
        $license = string;
        $driver = string;
        $passengers = int;

        public fucntion __construct($license, $driver){
            $this->license = $license;
            $this->driver = $driver
        }

        public function printDataCar(){
            echo "license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
        }
    }
?>