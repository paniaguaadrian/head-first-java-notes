package phraseOMatic;

public class PhraseOMatic {
  public static void main(String[] args) {
    java.util.Random randomGenerator = new java.util.Random();

    String[] wordListOne = { "agnostic", "opinionated", "numerical", "functional" };
    String[] wordListTwo = { "event driven", "microservices", "framework" };
    String[] wordListThree = { "library", "programming", "design" };

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int rand1 = randomGenerator.nextInt(oneLength);
    int rand2 = randomGenerator.nextInt(twoLength);
    int rand3 = randomGenerator.nextInt(threeLength);

    String outputPhrase = wordListOne[rand1] + ", " + wordListTwo[rand2] + " and " + wordListThree[rand3]
        + ".";

    System.out.println(
        "Your set of words is: " + outputPhrase);
  }

}