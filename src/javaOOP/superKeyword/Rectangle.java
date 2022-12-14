package javaOOP.superKeyword;

public class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }

    boolean isValid(){
        return false;
    }

    String getName(){
        return "Ahmad ROni";
        //System.out.println("Rosi");
    }

    void sayHello(){

    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }
}
