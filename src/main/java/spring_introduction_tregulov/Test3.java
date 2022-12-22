package spring_introduction_tregulov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //Pet pet = new Cat();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        //Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
