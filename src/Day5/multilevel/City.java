package Day5.multilevel;

public class City  extends State {
    private String cityName;
    private float area;

    // creating getter&setter method

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName +
                ", area=" + area +
                " , getStateName()=" +getStateName() +
                " ,getLanguage()=" +getLanguage() +
                " ,getCountryName()=" +getCountryName() +
                ", getCapital()=" +getCapital()+
                '}';
    }
}
