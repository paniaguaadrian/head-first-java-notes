package chapter_2.dogArrays;

public class Main {
  public static void main(String[] args) {
    // Create a new instance of the class Dog and assign it to the dogOne variable.
    Dog dogOne = new Dog();
    dogOne.bark();
    dogOne.name = "Sara";

    // Create an array of 3 Dogs
    Dog[] allDogs = new Dog[3];
    allDogs[0] = dogOne;
    allDogs[1] = new Dog();
    allDogs[2] = new Dog();

    // Assign names to each dog
    allDogs[1].name = "Tea";
    allDogs[2].name = "Martin";

    // Loop through them to bark once
    int x = 0;
    while (x < allDogs.length) {
      allDogs[x].bark();
      x = x + 1;
    }
  }
}
