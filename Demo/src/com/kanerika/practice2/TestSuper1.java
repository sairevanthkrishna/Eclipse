package com.kanerika.practice2;

class Animal{  
String color="white";  
 
class DogAnimal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(this.color);//prints color of Animal class  
}  
} } 
class TestSuper1{  
public static void main(String args[]){  
Animal in=new Animal();
Animal.DogAnimal inn=in.new DogAnimal();
inn.printColor();
}
}

