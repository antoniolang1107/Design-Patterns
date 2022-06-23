public class DecorLychee extends IngredientDecorator {
    public int calories = 100;
    public String description = "lychee jelly";
    public DecorLychee (MilkTea base) {
        this.base = base;
    }
}
