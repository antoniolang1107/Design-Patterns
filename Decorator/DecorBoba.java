public class DecorBoba extends IngredientDecorator {
    public DecorBoba (MilkTea base) {
        this.base = base;
    }
    public int calories = 60;
    public String description = "boba pearls";

    public int getCalories() {return calories + base.getCalories();}
    public String getDescription() {return description + base.getDescription();}
}