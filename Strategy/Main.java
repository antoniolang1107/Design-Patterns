public class Main {
    public static void main(String[] args) {
        Character Teddy = new Host();

        System.out.println("The new host 'Teddy' will demonstrate his ability");
        Teddy.move();
        Teddy.attack();

        System.out.println("\n'Teddy' will now change what he can do");
        Teddy.setAttackBehavior(new AttackPunch());
        Teddy.setMoveBehavior(new MoveHorse());

        Teddy.move();
        Teddy.attack();
    }
}