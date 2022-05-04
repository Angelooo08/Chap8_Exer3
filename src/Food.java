public class Food{
    private String productItem;
    private double price;
    private double fats;
    private double carbs;
    private double fiber;

    


    public Food(String productItem, double price, double fats, double carbs, double fiber){

        this.productItem = productItem;
        this.price = price;
        this.fats = fats;
        this.carbs = carbs;
        this.fiber = fiber;
 }


    public String getProductItem(){
        return productItem;
    }

    public double getPrice(){
        return price;
    }

    public double getFats(){
        return fats;
    }

    public double getCarbs(){
        return carbs;
    }

    public double getFiber(){
        return fiber;
    }


}