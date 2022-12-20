package spring_introduction_tregulov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
