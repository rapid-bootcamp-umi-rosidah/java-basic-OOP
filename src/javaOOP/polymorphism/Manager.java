package javaOOP.polymorphism;

public class Manager extends Employee{
    Manager(String name){
        super(name);
    }

    void sayHello(){
        System.out.println("Hello Manager "+ this.name);
    }
}


