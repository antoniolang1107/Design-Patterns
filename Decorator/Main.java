class Main {
    public static void main(String[] args) {
        MilkTea thaiMilkTea = new DecorBoba(new MilkTeaThai());

        System.out.println("The thai milk tea has " + thaiMilkTea.getCalories() + " calories.");
    }
}
