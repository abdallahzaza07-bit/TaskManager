public class Feeder {

    public Feeder(){
        
    }

    private int currentFood(int numBirds){
        if(numBirds > 0){
            return (int)(Math.random() * 41 + 10) * numBirds;
        }
        else{
            return 0;
        }
    }

    public void simulateOneDay(int numBirds){
        double conditionDouble = Math.random();
        if (conditionDouble < 0.05){
             = 0;
        }
        else{
             = currentFood(numBirds)
        }
    }

    public int simulateManyDays(int numBirds, int numDays){
        return
    }
}
