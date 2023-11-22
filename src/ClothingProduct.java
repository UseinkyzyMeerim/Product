public class ClothingProduct implements Product {
    private String brand;
    private String nameOfClothes;
    private String size;
    private String color;
    private Double price;
    private  Double weight;

    public ClothingProduct(String brand,String nameOfClothes, String size, String color,double price,double weight) {
        this.brand = brand;
        this.nameOfClothes = nameOfClothes;
        this.size = size;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return "Brand: " + brand + "\nName of clothes: " + nameOfClothes +  "\nSize: " + size + "\nColor: " + color;

    }

    @Override
    public double calculateShoppingCost(double distance) {
        double costOfShipping = distance * 5 ;
        if (weight > 5) {
            return costOfShipping * weight * 20;
        } else return costOfShipping;
    }

    @Override
    public boolean isFreeShipping() {
        if (price > 5000) {
            return  true;
        } else
            return false;

    }


    @Override
    public void applyAdditionalDiscount(double extraDiscount) {

        double newPrice = price - extraDiscount;
        System.out.println("Additional discount of " + extraDiscount + "сом" + " applied. New price:" + newPrice + "сом");
    }

}
