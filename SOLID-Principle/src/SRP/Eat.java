package SRP;

public class Eat {
    Pet pet;
    public Eat(Pet pet) {
        this.pet = pet;
    }
    public String eat(){
        return pet.getPetName() + " is eating with his owner " + pet.getOwner();
    }
}
