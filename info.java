public class info {
    
class StudentInfo {
    String fullName;
    String id;

    StudentInfo(String fullName, String id) {
        this.fullName = fullName;
        this.id = id;
    }
}

public class StudentMain {
    public void main(String[] args) {
        // Create objects using literal and new String()
        StudentInfo s1 = new StudentInfo("Ali Khan", "12345");
        StudentInfo s2 = new StudentInfo(new String("Sara Ahmed"), new String("12346"));
        System.out.println("Length of " + s1.fullName + ": " + s1.fullName.length());
        System.out.println("Length of " + s2.fullName + ": " + s2.fullName.length());
        String firstName1 = s1.fullName.substring(0, s1.fullName.indexOf(" "));
        String firstName2 = s2.fullName.substring(0, s2.fullName.indexOf(" "));
        System.out.println("First Name of s1: " + firstName1);
        System.out.println("First Name of s2: " + firstName2);
        System.out.println("Equals result: " + s1.id.equals(s2.id));
        System.out.println("CompareTo result: " + s1.id.compareTo(s2.id));
        String literal = "Hello";
        String newString = new String("Hello");
        System.out.println("Using == : " + (literal == newString));
        System.out.println("Student: " + s1.fullName + " ID: " + s1.id + " First Name: " + firstName1);
        System.out.println("Student: " + s2.fullName + " ID: " + s2.id + " First Name: " + firstName2);
    }
}





}
