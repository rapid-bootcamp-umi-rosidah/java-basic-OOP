package javaOOP.abstractMethod;

public class MainAbstractMethod {
    public static void main(String[] args) {
        Cat cat = new Cat("Pussi");
        cat.run();
        cat.canEat();
        cat.canJump();

        Cat cat1 = new Cat("Catty");
        cat1.run();
        cat1.canEat();
        cat1.canJump();

        Cat cat2 = new Cat("Citty");
        cat2.run();
        cat2.canEat();
        cat2.canJump();

        Cat cat3 = new Cat("Moza");
        cat3.run();
        cat3.canEat();
        cat3.canJump();

        Horse horse1 = new Horse("Baidu");
        horse1.run();
        horse1.canEat();
        horse1.canJump();

        Horse horse2 = new Horse("Broni");
        horse2.run();
        horse2.canEat();
        horse2.canJump();

        Horse horse3 = new Horse("Biki");
        horse3.run();
        horse3.canEat();
        horse3.canJump();
    }
}
