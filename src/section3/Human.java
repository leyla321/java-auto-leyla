package section3;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String [] [] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Family family, String [] [] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
        this.schedule = schedule;
    }

    public Human() {

    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
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

    public Family getFamily() {

        return family;
    }

    public void setFamily(Family family) {

        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && name.equals(human.name) && surname.equals(human.surname) && family.equals(human.family) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    public void describePet() {
        String trickLevelDescription;
        if (family.getPet().getTrickLevel() > 50) {
            trickLevelDescription = "very tricky";
        } else {
            trickLevelDescription = "almost not tricky";
        }
        System.out.println("I have a " + family.getPet().getSpecies() + ", he's " + family.getPet().getAge() +
                " years old, he's " + trickLevelDescription);
    }
    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", " +
                "', schedule='" + "["+schedule+"]"+
                "}";
    }
}
