package section2.exercise2;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String [] [] schedule;

    // create constructor which describes name, surname and birth year
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    // create constructor which describes name, surname, birth year, mother and father
    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    // constructor which describes all the fields
    public Human(String name, String surname, int year, int iq, Pet pet, Human mother,
                 Human father, String [] [] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
    // empty constructor
    public Human() {

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public int getIq() {
        return iq;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getMother() {
        return mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }

    public Human getFather() {
        return father;
    }
    public void setSchedule(String [] [] schedule) {
        this.schedule = schedule;
    }
    public String [] [] getSchedule() {
        return schedule;
    }
    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }
    public void describePet() {
        String trickLevelDescription;
        if (pet.getTrickLevel() > 50) {
            trickLevelDescription = "very tricky";
        } else {
            trickLevelDescription = "almost not tricky";
        }
        System.out.println("I have a " + pet.getSpecies() + ", he's " + pet.getAge() + " years old, he's " + trickLevelDescription);

    }
    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", " +
                "mother=" + mother + ", father=" + father + ", pet=" + pet + "}";
    }
}
