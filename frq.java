    public class frq{
    public static void main(String[] args) {
    

    String beadSequence = "bowob";
    boolean lengthGood = beadSequence.length()>= 5 && beadSequence.length() <= 10;

    boolean correctColors = beadSequence.contains("b") && beadSequence.contains("w");

    char first = beadSequence.charAt(0);
    char last = beadSequence.charAt(beadSequence.length() - 1);
    boolean startEndGood = first==last;
    
        if (correctColors&& lengthGood&& startEndGood){

        System.out.print("Acceptable");
        
        }
        else{
            System.out.print("not acceptable");


        }




        }












    }















    

