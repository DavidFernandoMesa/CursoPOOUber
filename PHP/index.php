<?php
require_once 'Account.php';
require_once 'Car.php';

$car = new Car("AWKK3", new Account ("David Fernando", "DAV855"));
$car->printDataCar();