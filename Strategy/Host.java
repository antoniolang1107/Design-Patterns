public class Host extends Character {
    public Host() {
        moveBehavior = new MoveWalk();
        attackBehavior = new AttackPistol();
    }
}
