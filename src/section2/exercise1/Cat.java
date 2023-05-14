package section2.exercise1;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private static final String catVoice = "meow";

    public Cat() {
        // default constructor
    }
    public Cat(String name, int age, double weight) { // constructor with arguments
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void setName(String catName) {
        this.name = catName;
    }
    public void setAge(int catAge) {
        this.age = catAge;
    }
    public void setWeight(double catWeight) {
        this.weight = catWeight;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

    public static void eat() {
        System.out.println("The cat is eating!");
    }

}
