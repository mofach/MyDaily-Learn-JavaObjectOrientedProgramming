package srcPackages;

/**
 *
 * @author AqilMFach
 */
// Monster.java
public class Monster extends Character {

    public Monster(String name, int attackPower, int healthPoint, int defense, int stamina, String[] skills) {
        super(name, attackPower, healthPoint, defense, stamina, skills);
    }

    @Override
    public void attack(Character opponent, int skillIndex) {
        if (skillIndex == 0) {
            // Basic attack
            System.out.println(name + " uses Basic Attack!");
            opponent.takeDamage(attackPower);
        } else if (stamina >= 10) {
            int damage = attackPower + (skillIndex * 10); // Different damage for different skills
            System.out.println(name + " uses " + skills[skillIndex] + "!");
            opponent.takeDamage(damage);
            useStamina(10);
        } else {
            System.out.println(name + " is out of stamina and uses Basic Attack!");
            opponent.takeDamage(attackPower);
        }
    }
}
