package Day5.hierarchical;

public class Person {
    private String name;
    private String city;

    // creating default constructor
    public Person(){
        this.name="vivek";
        this.city="Banglore";
    }
    //creating parameterized constructor
    public Person(String name,String city){
        this.name=name;
        this.city=city;
    }
    // creating getter&setter method
    public void SetName(String name){
        this.name=name;
    }
    public void SetCity(String city){
        this.city=city;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
