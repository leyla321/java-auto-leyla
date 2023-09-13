package section3;

import section3.Human;
import section3.Pet;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Monkey", "Zaza");
        Pet pet2 = new Pet("Horse", "Sugar");
        Human mother = new Human("Jennifer", "Anniston", 1948);
        Human father = new Human("Adam", "Sandler", 1945);
        String[][] schedule = {{"Monday", "Work"}, {"Tuesday", "Work"}, {"Thursday", "Rest"}};
        Family family = new Family(mother, father);

        Human child1 = new Human("Jamie", "Morningstar", 1988, 70, family, schedule);
        Human child2 = new Human("Leila", "Morningstar", 1990);
        family.addChild(child1);
        family.addChild(child2);
        family.setPet(pet1);

        System.out.println(family);
        family.deleteChild(child2);
        System.out.println(family);

    }
}
