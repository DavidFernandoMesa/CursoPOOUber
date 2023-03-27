<?php
require_once ('Account.php');

class User extends Account{
    public function __construct($name, $document, $email, $password){
        parent::__construct($name, $document, $email, $password);
    }

    public function printDataUser(){
            echo "Name: $this->name, Documento: $this->document, Email: $this->email, Password $this->password";
        }
}