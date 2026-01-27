public class task23 {
    public static void main(String[] args) {

        String a = "programmning";
        String b = "banana";



        a = a.substring(3, 7);
        System.out.println(a.length());
        System.out.print(b.indexof("a"));



        String s = "hello";
String result = s.substring(4, 20);

//it will cause an StringIndexOutOfBoundsException error because hello only has 5 characters (indexes 0–4) and index 20 doesnt exist


//1.compareTo() checks alphabetical order.
//1.equals() checks if the two strings have exactly the same text.


String a = "apple";
String b = "banana";

System.out.println(a.compareTo(b));
System.out.println(b.compareTo(a));
System.out.println(a.equals("apple"));
System.out.println(a == new String("apple"));

//-1 1 true false





String s1 = "zebra";
String s2 = "lion";
String s3 = "elephant";

// Compare and print which comes first alphabetically
if (s1.compareTo(s2) < 0) {
    System.out.println(s1 + " comes before " + s2);
} else {
    System.out.println(s2 + " comes before " + s1);
}

if (s2.compareTo(s3) < 0) {
    System.out.println(s2 + " comes before " + s3);
} else {
    System.out.println(s3 + " comes before " + s2);
}

if (s1.compareTo(s3) < 0) {
    System.out.println(s1 + " comes before " + s3);
} else {
    System.out.println(s3 + " comes before " + s1);
}




//why == should not be used for string equality

//== compares memory addresses, not the text content.
//two strings with the same letters might be stored in different memory locations, so == can return false.


}
}