package Model;

public class IngredientQuantity {
    int quantity;
    Ingredient ingredient;

    //METHODS

    public IngredientQuantity() {};
    public IngredientQuantity(int q,Ingredient i) {

        quantity=q;
        ingredient=i;
    };


    //Getters
    public int getQuantity() {
        return quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    //Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
    //to string

    public String toString(){

        return "Ingredient: "+ingredient.getName()+" Quantity "+quantity;
    };
}
