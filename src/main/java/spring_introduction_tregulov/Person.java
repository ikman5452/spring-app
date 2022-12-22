package spring_introduction_tregulov;

public class Person {
    private final Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created!");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
