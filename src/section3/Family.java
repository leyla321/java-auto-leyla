package section3;


import section3.Human;
import section3.Pet;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human [] children;
    private Pet pet;

    public Family() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) && father.equals(family.father) && Arrays.equals(children, family.children) && pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    public Family(Human mother) {

        this.mother = mother;
    }

    public Family(Human mother, Human father) {
        if (mother != null && father != null) {
            this.mother = mother;
            this.father = father;
            mother.setFamily(this);
            father.setFamily(this);
            children = new Human[0];
        }
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[1]; //1
        this.pet = pet;

        this.children[0] = new Human();
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        if (child != null) {
            child.setFamily(this);
            Human[] newChildren = Arrays.copyOf(children, children.length + 1);
            newChildren[children.length] = child;
            children = newChildren;
        }
    }

    public boolean deleteChild(Human child) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == child) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Human[] newChildren = new Human[children.length - 1];
            int newIndex = 0;
            for (int j = 0; j < children.length; j++) {
                if (j != index) {
                    newChildren[newIndex] = children[j];
                    newIndex++;
                }
            }
            child.setFamily(null);
            children = newChildren;
            return true;
        }
        return false;
    }

    public int countFamily() {

        return children.length + 2;
    }

    @Override
    public String toString() {
        return "Human{mother='" + mother + "', father='" + father + "', children='"
                + Arrays.toString(children) + "', pet='" + pet.toString() + "}";
    }

}
