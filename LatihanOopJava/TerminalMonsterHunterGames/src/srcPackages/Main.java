package srcPackages;

/**
 *
 * @author AqilMFach
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            // Create heroes
            Hero[] heroes = {
                new Hero("Warrior", 30, 100, 20, 50, new String[]{"Basic Attack", "Slash", "Shield Bash", "Power Strike"}),
                new Hero("Mage", 40, 80, 10, 60, new String[]{"Basic Attack", "Fireball", "Ice Blast", "Lightning Bolt"}),
                new Hero("Rogue", 35, 90, 15, 70, new String[]{"Basic Attack", "Backstab", "Poison Dart", "Shadow Strike"})
            };

            // Create monsters
            Monster[] monsters = {
                new Monster("Goblin", 25, 70, 10, 40, new String[]{"Basic Attack", "Claw", "Bite", "Scratch"}),
                new Monster("Orc", 35, 100, 20, 50, new String[]{"Basic Attack", "Smash", "Headbutt", "Stomp"}),
                new Monster("Dragon", 50, 150, 30, 60, new String[]{"Basic Attack", "Fire Breath", "Tail Whip", "Roar"})
            };

            // Hero selection
            System.out.println("Select your hero:");
            for (int i = 0; i < heroes.length; i++) {
                System.out.println((i + 1) + ". " + heroes[i].name);
            }
            int heroChoice = scanner.nextInt() - 1;
            Hero selectedHero = heroes[heroChoice];

            // Random monster selection
            Monster selectedMonster = monsters[random.nextInt(monsters.length)];

            System.out.println("You have selected: " + selectedHero.name);
            System.out.println("Your opponent is: " + selectedMonster.name);

            // Game loop
            while (selectedHero.isAlive() && selectedMonster.isAlive()) {
                selectedHero.showStatus();
                selectedMonster.showStatus();

                System.out.println("Choose your attack:");
                for (int i = 0; i < selectedHero.skills.length; i++) {
                    System.out.println((i + 1) + ". " + selectedHero.skills[i]);
                }
                int skillChoice = scanner.nextInt() - 1;
                selectedHero.attack(selectedMonster, skillChoice);

                if (selectedMonster.isAlive()) {
                    int monsterSkillChoice = random.nextInt(selectedMonster.skills.length);
                    selectedMonster.attack(selectedHero, monsterSkillChoice);
                }
            }

            if (selectedHero.isAlive()) {
                System.out.println("You have defeated the " + selectedMonster.name + "!");
            } else {
                System.out.println("You were defeated by the " + selectedMonster.name + "...");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}
