public class lecture8 {
public static String DayOfWeek(int m, int d, int y){
    int y0 = y - (14 - m) / 12;
    int x = y0 + y0/4 - y0/100 + y0/400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
    int d0 = (d + x + (31*m0)/12) % 7;

  if (d0 == 0){
        return "Sunday";
    } else if (d0 == 1){
        return "Monday";
    } else if (d0 == 2){
        return "Tuesday";
    }
    else if(d0 == 3){
    return  "wednesday";
    }
    else if(d0 == 4){
        return "thursday";
        }
    else if(d0 == 5){
           return "friday";
    }
else if(d0 == 6){
return "saturday";




}




  }
}




 


