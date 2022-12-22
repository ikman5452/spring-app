package spring_introduction_tregulov;

public class Person {
    private Pet pet;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created!");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created!");
    }

    public void setPet(Pet pet) {
        System.out.println("In class Person set pet!");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
