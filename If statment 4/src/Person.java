import java.util.Random;

public class Person {

    int age;

    Random rnd = new Random();


    int min = 5;
    int max = 80;

    //int x = (int) Math.floor(Math.random()*(max-min+1)+min);


    public Person() {

        this.age = (int) Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println(age);

    }

    public String getLifeStage() {
        if (age < 12) {
            System.out.print("child");
        } else if (age >= 13 && age <= 19) {
            System.out.print("adult");
        } else if (age >= 20 && age <= 59) {
            System.out.print("Senior");}
        else if (age >= 60 && age <= 80)
            System.out.print("It old");

        return("" + age);
    }
}





/*a method getLifeStage that returns a string about the life stage of the Person:

           <=12 is a Child
    13-19 is a Teen
    20-59 is an Adult
    +60 is a Senior Adult





*/