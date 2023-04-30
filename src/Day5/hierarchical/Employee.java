package Day5.hierarchical;

public class Employee extends Person {
    private int empId;
    private float salary;
    private String dept;

    // creating default constructor
    public Employee(){
        System.out.println("default constructor");
    }

    // creating parametrized constructor
    public Employee(int empId,float salary,String dept){
        super();// revoking the parent class constructor
        this.empId=empId;
        this.salary=salary;
        this.dept=dept;
    }
    public Employee(int empId,float salary,String dept,String name,String city){
        super(name,city);// reusing the parent class constructor
        this.empId=empId;
        this.salary=salary;
        this.dept=dept;
    }

    // creating getter&setter method
    public void SetEmpId(int empId){
        this.empId=empId;
    }
    public void SetSalary(float salary){
        this.salary=salary;
    }
    public void SetDept(String dept){
        this.dept=dept;
    }
    public int getEmpId(){
        return empId;
    }
    public float getSalary(){
        return salary;
    }
    public String getDept(){
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", salary=" + salary +
                ", dept='" + dept +
                ", getName()="+ getName() +
                ", getCity()=" + getCity() +
                '}';
    }
}
