<?php
    class Account {
        $id = int;
        $name = string;
        $document = string;
        $email = string;
        $password = string;

        public function __construct($name, $document){
            $this->name = $name;
            $this->document = $document;
        }
    }
?>