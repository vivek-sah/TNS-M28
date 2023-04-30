package Day5.association;

public class Bike {
    private String color;
    private int topSpeed;

    public void SetColor(String color) {
        this.color = color;

    }

    public void SetTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getColor() {
        return color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void BikeInfo() {
        System.out.println("color: " + color + "\t" + "topSpeed: " + topSpeed);
    }

    public static void main(String[] args) {
        Bike bk = new Bike();
        bk.SetColor("black");
        bk.SetTopSpeed(120);
        bk.BikeInfo();
    }
}