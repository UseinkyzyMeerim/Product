
public class Main {
    public static void main(String[] args) {
        ElectronicProduct electronicProduct = new ElectronicProduct("Smartphone",
                                                                        100000,0.3);
        System.out.println(electronicProduct.displayInfo());

        double shippingCost = electronicProduct.calculateShoppingCost(10.0);
        System.out.println("Shipping cost:" + shippingCost + "сом");
        double discountedPrice = electronicProduct.discountPrice(15.0);
        System.out.println("Wiht Discount price:" + discountedPrice + "сом");
        System.out.println("Shipping is free? " + electronicProduct.isFreeShipping());

        ClothingProduct clothingProduct = new ClothingProduct("Zara","Coat Trench",
                                                         "L","Beige",3200,0.2);
        System.out.println("\n" + clothingProduct.displayInfo());
        System.out.println("Shipping cost: " + electronicProduct.calculateShoppingCost(5) + "сом");
        electronicProduct.applyAdditionalDiscount(500);
        System.out.println("Shipping is free? " + clothingProduct.isFreeShipping());






    }
    }
