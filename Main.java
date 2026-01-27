public class Main {
    public static void main(String[] args) {
        // Create two characters
        Character c1 = new Character(); 
        Character c2 = new Character("Warrior", 80, 5, 10);
        String c3 = new String();
        String c4 = "hi";
        int c5;
        c5 = 3;

        

        c2.move(3, -2);
        c2.takeDamage(20);
        c4.

        System.out.println("Before reference assignment:");
        System.out.println("c1 -> " + c1);
        System.out.println("c2 -> " + c2);

        c1 = c2;

        c1.move(5, 5);
        c1.takeDamage(10);

        System.out.println("\nAfter modifying c1 (which also changes c2):");
        System.out.println("c1 -> " + c1);
        System.out.println("c2 -> " + c2);
    }
}
