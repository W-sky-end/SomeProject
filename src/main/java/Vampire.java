public class Vampire extends Monster {
    private boolean enraged = false;

    public Vampire(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    public void lifeSteal() {
        heal(getDamage() * 10 / 100);
    }

    public void checkRage() {
        if (!enraged && getHp() <= getMaxHP() * 30 / 100) {
            enraged = true;
            System.out.println("Aghhhrrrrrrrr......You fool! You can't kill me!");
        }
    }
    public int getDamage() {
        if (enraged) {
            return super.getDamage() * 2;
        }
        return super.getDamage();
    }
}
