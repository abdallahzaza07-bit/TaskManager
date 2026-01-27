public class practiceeee {

      public static boolean canWatchMovie(int age, boolean parentalApproval){

        if(13<=age){
                return true;
        } else if (parentalApproval){
                return true;
        }       else return false;
      }

public static void main(String[] args) {
        
        boolean age1 = canWatchMovie(15, false);
        boolean age2 = canWatchMovie(13, age1);

        System.out.println(age1);
        System.out.print(age2);
}


}






















