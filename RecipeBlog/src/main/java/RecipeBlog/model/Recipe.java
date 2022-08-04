package RecipeBlog.model;

import java.util.List;

public class Recipe {

    private List<Ingredient> ingredients;
    private String instructions;
    //TODO: Add images to each recipe

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public boolean addIngredient(Ingredient ingredient){
        return this.ingredients.add(ingredient);
    }

    public boolean removeIngredient(Ingredient ingredient){
        return this.ingredients.remove(ingredient);
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }



}
