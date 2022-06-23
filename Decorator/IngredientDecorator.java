public abstract class IngredientDecorator extends MilkTea {
    public MilkTea base;
    public int calories;
    public String description;

    public int getCalories() {return calories + base.getCalories();}
    public String getDescription() {return description + base.getDescription();}
}
