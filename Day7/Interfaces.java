
interface Animal {

    void eat();

    void sleep();
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

}

public class Interfaces {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}
