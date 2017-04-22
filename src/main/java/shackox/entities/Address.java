package shackox.entities;

/**
 * Created by SHACKOX on 17/04/17.
 */
public class Address {
    private String city;
    private String country;

    protected Address() {

    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
