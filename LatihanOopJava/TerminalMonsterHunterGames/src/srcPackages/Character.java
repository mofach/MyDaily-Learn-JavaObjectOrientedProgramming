package srcPackages;

/**
 *
 * @author AqilMFach
 */
// Character.java
abstract class Character {
    protected String name;
    protected int attackPower;
    protected int healthPoint;
    protected int defense;
    protected int stamina;
    protected String[] skills;

    public Character(String name, int attackPower, int healthPoint, int defense, int stamina, String[] skills) {
        this.name = name;
        this.attackPower = attackPower;
        this.healthPoint = healthPoint;
        this.defense = defense;
        this.stamina = stamina;
        this.skills = skills;
    }

    public abstract void attack(Character opponent, int skillIndex);

    public boolean isAlive() {
        return healthPoint > 0;
    }

    public void takeDamage(int damage) {
        int effectiveDamage = damage - defense;
        if (effectiveDamage > 0) {
            healthPoint -= effectiveDamage;
        }
    }

    public void showStatus() {
        System.out.println(name + " - HP: " + healthPoint + ", Stamina: " + stamina);
    }

    public void useStamina(int amount) {
        stamina -= amount;
    }

    public int getStamina() {
        return stamina;
    }
}
