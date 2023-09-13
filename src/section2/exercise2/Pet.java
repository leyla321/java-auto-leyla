package section2.exercise2;

import java.util.Arrays;
import java.util.Objects;


public class Pet {
        private String species;
        private String nickname;
        private int age;
        private int trickLevel;
        private String [] habits;

        // constructor which describes species and nickname of the animal
        public Pet(String species, String nickname) {
            this.species = species;
            this.nickname = nickname;
        }
        // constructor which describes all the fields
        public Pet(String species, String nickname, int age, int trickLevel, String [] habits) {
            this.species = species;
            this.nickname = nickname;
            this.age = age;
            this.trickLevel = trickLevel;
            this.habits = habits;
        }
        // empty constructor
        public Pet() {
        }

        public void setSpecies(String species) {
            this.species = species;
        }
        public String getSpecies() {
            return species;
        }
        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
        public String getNickname() {
            return nickname;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        public void setTrickLevel(int trickLevel) {
            this.trickLevel = trickLevel;
        }
        public int getTrickLevel() {
            return trickLevel;
        }
        public void setHabits(String [] habits) {
            this.habits = habits;
        }
        public String [] getHabits() {
            return habits;
        }
        public void eat() {
            System.out.println("I'm eating!");
        }
        public void respond() {
            System.out.println("Hello, master. I am " + nickname + ". I missed you!");
        }
        public void foul() {
            System.out.println("You need to cover your tracks well...");
        }

        @Override
        public String toString() {
            return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", " +
                    "habits=" + Arrays.toString(habits) + "}";
        }
}

