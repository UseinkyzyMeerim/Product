public interface Product {
    String displayInfo();
    double calculateShoppingCost(double distance);

    default boolean isFreeShipping() {

        return false;
    }

    default double discountPrice(double discountPercentage) {
        return 0;
    }
    default  void applyAdditionalDiscount(double extraDiscount) {

    }

}
