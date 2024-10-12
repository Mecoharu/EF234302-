package quiz_1;

public class Player {
    // Attributes player
    private String name;
    private int health;
    private int power;
    private int defense;

    // Constructor to initialize the player's attributes
    public Player(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

   //Getter name ,health,power and defense player
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getPower() {
        return power;
    }
    public int getDefense() {
        return defense;
    }

    //Method to attack the enemy
    public void attack(Enemy enemy) {
        System.out.println(this.name + " attacks " + enemy.getName());
        enemy.takeDamage(this.power);
    }

    // Method to take damage from an enemy's attack
    // The damage is calculated based on the enemy's attack power - the player's defense
    public void takeDamage(int attackPower) {
        int damage = attackPower - this.defense;
        
        // If damage is greater than 0, the player's health is reduced
        if (damage > 0) {
            this.health -= damage;
            System.out.println(this.name + " takes " + damage + " damage.");
        } else {
            System.out.println(this.name + " blocks the attack.");
        }

        // Check if the player's health is below or equal to 0, indicating the player has died
        if (this.health <= 0) {
            System.out.println(this.name + " died!");
        } else {
            System.out.println(this.name + " has " + this.health + " health remaining.");
        }
    }
}
