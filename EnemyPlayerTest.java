package quiz_1;

public class EnemyPlayerTest {
    public static void main(String[] args) {
       
    	// Creating a Player object with name, health, power, and defense
        Player player = new Player("Aven", 100, 25, 20);

        // Creating an Enemy object with name, health, power, and defense
        Enemy enemy = new Enemy("Tartaglia", 100, 50, 10);

        // The player attacks the enemy
        player.attack(enemy);
        
        // The enemy attacks the player
        enemy.attack(player); 
    }
}