package quiz_1;

public class Enemy {
    //Attributes Enemy
    private String name;
    private int health;
    private int power;
    private int defense;

    // Constructor to initialize the enemy's attributes
    public Enemy(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    //Getter name ,health,power and defense enemy
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

    // Method to attack the player
    public void attack(Player player) {
        System.out.println(this.name + " attacks " + player.getName());
        player.takeDamage(this.power); 
    }

    // Method to take damage from a player's attack
    // The damage is calculated based on the player's attack power - the enemy's defense
    public void takeDamage(int attackPower) {
        int damage = attackPower - this.defense;
        
      //If the damages greater than 0  reduce the enemy health
        if (damage > 0) {
            this.health -= damage;
            System.out.println(this.name + " takes " + damage + " damage.");
        } else {
            System.out.println(this.name + " blocks the attack.");
        }

        // Check if the enemy's health is below or equal to 0
        if (this.health <= 0) {
            System.out.println(this.name + " died!");
        } else {
            System.out.println(this.name + " has " + this.health + " health remaining.");
        }
    }
}
