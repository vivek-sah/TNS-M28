package Day5.singleinheritance;

public class Student extends Citizen{
    private int rollNo;
    private String collegeName;

    // creating default constructor
    Student(){
        super();
    }

    // creating parameterized constructor
    Student(String name,long aadharNo,String address,long phNo,int rollNo,String collegeName){
        super(name,aadharNo,address,phNo);// reusing the parent class
        this.rollNo=rollNo;
        this.collegeName=collegeName;
    }

    // creating getter&setter method

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", collegeName='" + collegeName +
                ", getName()=" +getName() +
                ", getAadharNo()="+ getAadharNo() +
                ", getAddress()=" +getAddress() +
                ", getPhNo()=" + getPhNo()+
                '}';
    }
}
