package Ss10Rikke;

public class Computer {
    public double calculatePrice(double basePrice) {
        System.out.println("Cong thuc: Gia goc");
        return basePrice;
    }

    public double calculatePrice(double basePrice, double tax) {
        System.out.println("Cong thuc: Gia goc + VAT");
        return basePrice + (basePrice * tax);
    }

    public double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("Cong thuc: Gia goc + VAT - Discount");
        return basePrice + (basePrice * tax) - discount;
    }

    public static void main(String[] args) {
        Computer c = new Computer();

        double p1 = c.calculatePrice(1000);
        System.out.println("Gia 1:"+p1);
        System.out.println();
        double p2 = c.calculatePrice(1000,0.1);
        System.out.println("Gia 2:"+p2);
        System.out.println();
        double p3 = c.calculatePrice(1000,0.1,50);
        System.out.println("Gia 3:"+p3);


    }
}
