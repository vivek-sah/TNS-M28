package Day5.hierarchical;

public class Student extends Person {
    private String section;
    private int percentage;

    // creating default constructor
    public Student(){
        System.out.println("Student class consturctor");
        section="A";
        percentage=75;
    }

    // parameterized constructor and super keyword is used invoke parent class variable,method,constructor
    public Student(String section,int percentage){
        super();
        this.section=section;
        this.percentage=percentage;
    }

    // creating getter&setter method
    public void SetSection(String section){
        this.section=section;
    }
    public void SetPercentage(int percentage){
        this.percentage=percentage;
    }
    public String getSection(){
        return section;
    }
    public int getPercentage(){
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "section='" + section  +
                ", percentage=" + percentage +
                ", getName()=" +getName() +
                ", getCity()=" +getCity() +
                '}';
    }
}
