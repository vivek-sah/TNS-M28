package Day5.singleinheritance;

public class Citizen {
    private String name;
    private long aadharNo;
    private String address;
    private long phNo;

    // creating default constructor
    Citizen(){
        System.out.println("default constructor");
    }


    // creating parameterized constructor
    Citizen(String name,long aadharNo,String address,long phNo){
        this.name=name;
        this.aadharNo=aadharNo;
        this.address=address;
        this.phNo=phNo;
    }


    // creating getter&setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", aadharNo='" + aadharNo + '\'' +
                ", address='" + address + '\'' +
                ", phNo=" + phNo +
                '}';
    }
}
