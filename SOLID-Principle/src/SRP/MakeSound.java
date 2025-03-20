package SRP;

public class MakeSound {
    Pet pet;
    public MakeSound(Pet pet) {
        this.pet = pet;
    }
    public String makeSound(){
        return pet.getPetName()+ " is making a sound";
    }
}
