    public class Weapon {
        private String name;
        private int damage;

        public Weapon(String name, int damage) {
            this.damage = damage;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }

    }
