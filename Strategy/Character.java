public abstract class Character {
    MoveBehavior moveBehavior;
    AttackBehavior attackBehavior;

    public Character() {}

    public void setMoveBehavior(MoveBehavior mb) {
        moveBehavior = mb;
    }
    public void setAttackBehavior(AttackBehavior ab) {
        attackBehavior = ab;
    }

    public void move() {
        moveBehavior.move();
    }
    public void attack() {
        attackBehavior.attack();
    }
}
