package chapter_4.stateAndBehavior;

public class DogTestDriven {
  public static void main(String[] args) {

    Dog dogOne = new Dog();
    Dog dogTwo = new Dog();

    dogOne.name = "Sara";
    dogOne.size = 20;

    dogTwo.name = "Tea";
    dogTwo.size = 44;

    dogOne.bark(1);
    dogTwo.bark(2);
  }

}
