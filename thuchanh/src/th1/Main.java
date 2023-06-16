package Th1;


import th1.rikeeyacadey.Animal;
import th1.rikeeyacadey.Cat;
import th1.rikeeyacadey.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Lợn");
        Dog dog1 = new Dog("Bg", "Black");
        Dog dog2 = new Dog("Pg", "White");
        Cat cat = new Cat("Hiiiii");
        System.out.println("Tên các con vợ là : " + animal.getName());
        animal.setName("Huuuuu");
        System.out.println("Tên các con vợ là : " + animal.getName());
        animal.setName("haaaaaa");
        System.out.println("tên : " + dog1.getName());
        System.out.println("Sound : " + dog1.makeSound());
        System.out.println("Maàu : " + dog1.getColor());
        System.out.println("Sound : " + dog2.makeSound());
        System.out.println("tên : " + cat.getName());
        System.out.println("tên : " + cat.makeSound());


    }
}