public class prac2 {
    
String[] names = {"alice", "bob", "carla", "david"};

int[] scores = {95,48,77,60};

Studentsemester1 = new Studentscores(names, scores);
}

public String getHighestScorer(){

    int MaxScore = scores[0];
    String Topscorer = names[0];

    int i = 0;
    {
        while (i<scores.length){

            if (scores[i]> MaxScore){

                MaxScore = scores[i];
                Topscorer = names[i];
            }
            i++

        }
        return Topscorer;




    }






}















