<?php
require_once('account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    public $passanger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCAr(){
        echo "Licencia: $this->license Driver: ".$this->driver;
    }
}
?>