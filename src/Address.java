public class Address {
    private String  country;
    private  String Stare;
    private  String city;
    private  String street;
    private  String postalCode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStare() {
        return Stare;
    }

    public void setStare(String stare) {
        Stare = stare;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    @Override
    public String toString() {
        return "Adress{" + "country=" + country + ", Stare=" + Stare + ", city=" + city + ", street=" + street + ", postalCode=" + postalCode + '}';
    }
}
