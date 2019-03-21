package Model;

import Model.Utils.MyIList;
import Model.Utils.MyList;

public class Recipe {

    private String name;
    private MyIList<String> steps;
    private int prep_time;
    private int cook_time;

    private String category;
    private MyIList<IngredientQuantity> ingredients;
    // private MyIList<Nutrient> nutrients;

    // constructors
    public Recipe() {steps = new MyList<String>(); ingredients = new MyList<IngredientQuantity>();}
    public Recipe(String n, MyIList<String> s, int p, int c, String cat, MyIList<IngredientQuantity> i) {
        name = n;
        steps = s;
        prep_time = p;
        cook_time = c;
        category = cat;
        ingredients = i;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSteps(MyIList<String> steps) {
        this.steps = steps;
    }
    public void setPrep_time(int prep_time) {
        this.prep_time = prep_time;
    }
    public void setCook_time(int cook_time) {
        this.cook_time = cook_time;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setIngredients(MyIList<IngredientQuantity> ingredients) {
        this.ingredients = ingredients;
    }

    // getters
    public String getName() {
        return name;
    }
    public MyIList<String> getSteps() {
        return steps;
    }
    public int getPrep_time() {
        return prep_time;
    }
    public int  getCook_time() {
        return cook_time;
    }
    public String getCategory() {
        return category;
    }
    public MyIList<IngredientQuantity> getIngredients() {
        return ingredients;
    }

    // turning the prep/cook time into a string
    public String timeToString(){
        return "Prep: " + prep_time + "| Cook: " + cook_time;
    }

    // overall toString method
    public String toString(){
        return name + "\n" +timeToString()+ "\n" + "Ingredients: \n" + ingredients.toStr() + "Steps: \n" + steps.toStr();
    }

    public void addStep(String s){
        steps.push(s);
    }

    public void addIngredient(IngredientQuantity i){
        ingredients.push(i);
    }
}

































































































































































































































































