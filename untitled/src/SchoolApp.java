import SchoolApp.School;
import SchoolApp.Student;
import processing.core.PApplet;

public class SchoolApp extends PApplet{
    public static void main(String[] args) {PApplet.main(new String[] { "main"});} {
    }
    public void setup(){
        School deSchool = new School("AIM");
        Student s1 = new Student("hanneke", 1, "AIM");
        Student s2 = new Student("femke", 2, "AIM");
    }

}
