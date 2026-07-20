public class Monster {
    private String name;
    private int hp;
    private int damage;
    private final int maxHP;

    public Monster(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.maxHP = hp;
    }
    public boolean alive (){
        return hp > 0;
    }
    public void takeDamage(Player player) {
        hp -= player.getDamage();

        if (hp <= 0) {
            hp = 0;
            System.out.println("Monster is dead");
        }

        System.out.println("Monster's HP: " + hp);
    }
    public void heal(int heal) {
        hp += heal;
        if (hp > maxHP) {
            hp = maxHP;
        }
    }

    public int getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHP() {return maxHP;}
}
