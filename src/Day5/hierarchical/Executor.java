package Day5.hierarchical;
// executing the all classes
public class Executor {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println("printing the details of Perosn Class");
        System.out.println(p);

        Person p1;
        p1=new Person("krishna","Bengaluru");
        if(p1 instanceof Person){
            System.out.println("Priting the details of person class");
            System.out.println(p1);
        }


        p1=new Employee(102,85000f,"HR","Sikindra","Banglore");
        if(p1 instanceof Employee){
            System.out.println("details of employee class");
            System.out.println(p1);
        }

        // calling the student class
        p1 =new Student("B",80);
        if(p1 instanceof Student){
            System.out.println("printing the student class details "+p1);
        }
    }
}
