package uk.ac.westminster.products_api;
//Line 1: finish this sentence — "A PhysicalProduct IS-A Product
//because…". Line 2: name one other class a shop system might
//have that would NOT pass this test, and say why.
public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;


    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name,double price, double weightKg, String dimensions){
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
