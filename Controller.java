package Controller;
import Model.IngredientQuantity;
import Model.Recipe;
import Repository.RecipeRepository;

public class Controller {

    RecipeRepository repository;

    //METHODS

    public Controller() {
    }

    public Controller(RecipeRepository r) {
        this.repository = r;
    }

   //Getters and setters
    public RecipeRepository getRepository() {
        return repository;
    }

    public void setRepository(RecipeRepository repository) {
        this.repository = repository;
    }

    public void addRecipeC(Recipe r){
        System.out.print("a ajuns in controller");
        repository.addRecipe(r);

    }

    public void showRecipesC(){


        repository.showRecipes();



    }

}
