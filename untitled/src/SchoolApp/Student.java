package SchoolApp;

public class Student {
    private String naam;
    private int nummer;
    School school;

    public Student(String naam, int nummer, String school){
        this.naam = naam;
        this.nummer = nummer;
        this.school = new School(school);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
}

