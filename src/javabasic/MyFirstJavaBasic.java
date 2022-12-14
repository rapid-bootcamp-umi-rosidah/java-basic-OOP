package javabasic;

public class MyFirstJavaBasic
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        myFavoriteFood();
        myFavoriteDrink();
        myFavoritePlace();
    }

    //membuat method
    public static void myFavoriteFood() {
        System.out.println("My Fav Food");
        System.out.println(" 1. Sate");
        System.out.println(" 2. Steak");
        System.out.println(" 3. Nasi Goreng");
    }

    public static void myFavoriteDrink() {
        System.out.println("My Fav Drink");
        System.out.println(" 1. Jeruk peras");
        System.out.println(" 2. Matcha");
        System.out.println(" 3. Redvelvet");
    }

    public static void myFavoritePlace() {
        System.out.println("My Fav Place");
        System.out.println(" 1. Tawangmangu");
        System.out.println(" 2. Guci");
        System.out.println(" 3. Jebres");
    }

}