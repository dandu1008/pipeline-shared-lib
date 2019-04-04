package com.acceleratedskillup;

class Car {
  int numberOfDoors
  String brand
  String model
  def script1
  
	Car(script1) {
		this.script1 = script1
	}
	
  	void printOutCar() {
		script1.echo "using script.echo"
  		script1.echo "numberOfDoors:${numberOfDoors}"    	
		script1.echo "brand:${brand}"    	
		script1.echo "model:${model}"
  	}  
  
}
