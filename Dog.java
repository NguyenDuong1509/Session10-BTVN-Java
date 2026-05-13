package Ss10Rikke;

public class Dog extends Animal{
    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        d.makeSound();
    }
}
