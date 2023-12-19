package chapter_4.gettersAndSetters;

public class ElectricGuitar {
  /*
   * If we make our variables "private" we cannot access them directly with the
   * dot (ElectricGuitar.brand for example) we will need to use the setters and
   * getters to interact with our class and object (since those are public).
   */ // ! This concept is called ENCAPSULATION.
  private String brand;
  private int numOfPickups;
  private boolean rockStarUsesIt;

  public ElectricGuitar(String brand, int numOfPickups, boolean rockStarUsesIt) {
    this.brand = brand;
    this.numOfPickups = numOfPickups;
    this.rockStarUsesIt = rockStarUsesIt;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getNumOfPickups() {
    return numOfPickups;
  }

  public void setNumOfPickups(int numOfPickups) {
    this.numOfPickups = numOfPickups;
  }

  public boolean isRockStarUsesIt() {
    return rockStarUsesIt;
  }

  public void setRockStarUsesIt(boolean rockStarUsesIt) {
    this.rockStarUsesIt = rockStarUsesIt;
  }

  @Override
  public String toString() {
    return "ElectricGuitar {brand: " + brand + ", numOfPickups: " + numOfPickups + ", rockStarUsesIt: " + rockStarUsesIt
        + "}";
  }
}
