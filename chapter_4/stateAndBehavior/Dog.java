package chapter_4.stateAndBehavior;

public class Dog {
  String name;
  int size;

  // ! In this bark method, we added a parameter called numOfBarks to use it.
  public void bark(int numOfBarks) {

    while (numOfBarks > 0) {
      if (size > 30) {
        System.out.println("Dog named: " + name + " says " + "WOOF WOOF");
      } else {
        System.out.println("Dog named: " + name + " says " + "Ruff Ruff");
      }
      numOfBarks = numOfBarks - 1;
    }

  }
}
