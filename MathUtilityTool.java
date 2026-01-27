  public class MathUtilityTool {
    public static void main(String[] args) {
        int a = 25;
        int b = 60;

        int absDiff = Math.abs(a - b);
        System.out.println("Absolute Difference: " + absDiff);

        int randomNum = (int)(Math.random() * 100) + 1;
        System.out.println("Random Number (1–100): " + randomNum);

        double x1 = 3, y1 = 4, x2 = 7, y2 = 9;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between points: " + distance);

        int num = 42;
        Integer numObj = Integer.valueOf(num);
        System.out.println("Integer object: " + numObj);

        System.out.println("Integer MIN: " + Integer.MIN_VALUE);
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);

        Integer boxed = 10;
        int unboxed = boxed;
        Double boxedDouble = 5.5;
        double unboxedDouble = boxedDouble;

        System.out.println("Boxed Integer: " + boxed + ", Unboxed Integer: " + unboxed);
        System.out.println("Boxed Double: " + boxedDouble + ", Unboxed Double: " + unboxedDouble);
    }
}








}
}