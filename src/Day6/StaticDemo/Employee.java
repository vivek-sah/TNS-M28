package Day6.StaticDemo;

public class Employee {
    private int id;
    private String name;
    static String companyName="TNS";

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name +
                ", companyName= " + companyName+
                '}';
    }
}
