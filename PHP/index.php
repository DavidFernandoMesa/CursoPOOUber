<?php
require_once ('Car.php');
require_once ('UberX.php');
require_once ('UberPool.php');
require_once ('User.php');
require_once ('Account.php');

$uberX = new UberX("45FSD", new Account("Martinez Cosmo", "MRT87"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("875PDF", new Account("Karen Marrtinez", "KRN784"), "Dodge", "Attitude");
$uberPool->printDataCar();

$user = new User("Ana Maria", "8458887", "anita@gmail.com", "8459");
$user->printDataUser();