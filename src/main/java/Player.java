class Player {

    private String name;
    private int hp;
    Weapon weapon;
    Monster monster;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void takeDamage(Monster monster) {
        hp = hp - monster.getDamage();
        System.out.println("HP: " + hp);
        if (hp <= 0) {
            System.out.println("You lose");}
    }

    public void heal(int amount) {
        hp = hp + amount;
    }

    public void printInfo() {
        System.out.println("Name: " + name + "\nHP: " + hp);
    }

    public boolean alive() {
        return hp > 0;
    }
    public int getDamage() {
        return weapon.getDamage();
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}