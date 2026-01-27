public class prac {
public static void main(String[] args){

  sprite characheter1 = new sprite();
    sprite characheter2 = new sprite(45,67);
    sprite characheter3 = new sprite(90,50,"hi");

    System.out.println(characheter2.name);
    characheter3.run();
    characheter1.jump();
}
    
}
