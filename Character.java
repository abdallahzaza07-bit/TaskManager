public class Character {
    String name;
    int health;
    int positionX;
    int positionY;

    public Character() {
        name = "Unknown";
        health = 100;
        positionX = 0;
        positionY = 0;
    }

    public Character(String name, int health, int positionX, int positionY) {
        this.name = name;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void move(int dx, int dy) {
        positionX += dx;
        positionY += dy;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) {
            health = 0; 
        }
    }

    public String toString() {
        return name + " | Health: " + health + " | Position: (" + positionX + ", " + positionY + ")";
    }
}
