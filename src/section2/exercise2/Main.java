package section2.exercise2;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("dog", "benny");
        Pet pet2 = new Pet("bunny", "opal", 5, 70, new String[] {"sleep", "play"});
        Human human1 = new Human("Adam", "Sandler", 1945);
        Human human2 = new Human("Jennifer", "Anniston", 1948);
        Human human3 = new Human("Lucifer", "Morningstar", 1978, human1, human2);

        String[][] schedule = {{"Monday", "Work"}, {"Tuesday", "Work"}, {"Thursday", "Rest"}};
        Pet pet3 = new Pet("cat", "Tom", 6, 80, new String[] {"eat", "sleep", "play"});
        Human human4 = new Human("Megan", "Markle", 1988, 95, pet3, human3, human2, schedule);

        // print the info about each person
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());

        // create a family
        Human child = new Human("Jamie", "Morningstar", 1995);
        child.setMother(human2);
        child.setFather(human3);
        child.setPet(pet1);

        // call methods on the child and its pet
        child.greetPet();
        child.describePet();
        System.out.println(child.toString());
        pet1.eat();
        pet1.respond();
        pet1.foul();
    }
}
