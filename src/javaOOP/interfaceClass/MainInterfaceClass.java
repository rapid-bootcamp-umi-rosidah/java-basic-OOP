package javaOOP.interfaceClass;

public class MainInterfaceClass {
    public static void main(String[] args) {
        HasBrand brand = new HasBrandImpl("Indo Copy", 1998,10000);
        System.out.print("Brand "+ brand.getBrand());
        System.out.print(" was establised in "+ brand.getYearEstablised());
        System.out.print(" and has total employee "+ brand.getYearEstablised());
    }
}


