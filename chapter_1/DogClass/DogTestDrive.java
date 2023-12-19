package DogClass;

public class DogTestDrive {
  public static void main(String[] args) {
    Dog a = new Dog();
    a.name = "Sara";
    a.breed = "Hi there";
    a.size = 25;
    a.bark();

    System.out.println(a.name);
  }
}
