public class ElectronicProduct implements Product{
    private String name;
    private  double price;
    private double weight;
    final double COSTOFSHIPPING = 200;


    public ElectronicProduct(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;

    }

    @Override
    public String displayInfo() {
        return "Name: " + name + "\nPrice: " + price + "\nWeight: " + weight;
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
        if (price > 10000) {
            return true;
        } else return false;

    }

    @Override
    public double discountPrice(double discountPercentage) {

        return price -(price * (discountPercentage/100));


    }

}
