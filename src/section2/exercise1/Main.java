package section2.exercise1;

import section2.exercise1.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Junior");
        cat1.setAge(8);
        cat1.setWeight(13);
        Cat cat2 = new Cat();
        cat2.setName("Bobby");
        cat2.setAge(4);
        cat2.setWeight(6.5);
        Cat cat3 = new Cat("Baby", 3, 7.5);

        System.out.println("Cat 2 name is " +cat2.getName() + ", age is " + cat2.getAge() +
                " and weight is " + cat2.getWeight());
        Cat.eat();
    }
}
