package Model;


public class Nutrient {

      String name;
      String measure_unit;
      int quantity;

     //METHODS
      public  Nutrient(){}

      public Nutrient(String n,String mu, int q){

          name=n;
          measure_unit=mu;
          quantity=q;

      }
   //Getters
    public String getName() {
        return name;
    }

    public String getMeasure_unit() {
        return measure_unit;
    }

    public int getQuantity() {
        return quantity;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMeasure_unit(String measure_unit) {
        this.measure_unit = measure_unit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //to string

    public String toString(){

          return "Name: "+name+" Quantity "+measure_unit;
    };
}
