import java.util.ArrayList;

public class profile_Doctor {
    // personal information :
    private  String  first_name ;
    private  String  last_name ;
    private  String  Email ;
    private  String  website ;
    private  String  phone_number ;
    // Biography Section:
    private  String licence_cuntryname;
    private  String licence_Number;
    private  String year_in_practice;
    private  String gender;


    // education section
    private ArrayList <education_section> education ;

    // Adress Section
    private ArrayList <Address> Adress ;

    // Specialization_Section
    private ArrayList<Specialization_Section > Specialization ;



    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getLicence_cuntryname() {
        return licence_cuntryname;
    }

    public void setLicence_cuntryname(String licence_cuntryname) {
        this.licence_cuntryname = licence_cuntryname;
    }

    public String getLicence_Number() {
        return licence_Number;
    }

    public void setLicence_Number(String licence_Number) {
        this.licence_Number = licence_Number;
    }

    public String getYear_in_practice() {
        return year_in_practice;
    }

    public void setYear_in_practice(String year_in_practice) {
        this.year_in_practice = year_in_practice;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Profil_Doctor{" + "first_name=" + first_name + ", last_name=" + last_name + ", Email=" + Email + ", website=" + website + ", phone_number=" + phone_number + ", licence_cuntryname=" + licence_cuntryname + ", licence_Number=" + licence_Number + ", year_in_practice=" + year_in_practice + ", gender=" + gender + '}';
    }

    public ArrayList<education_section> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<education_section> education) {
        this.education = education;
    }

    public ArrayList<Address> getAdress() {
        return Adress;
    }

    public void setAdress(ArrayList<Address> adress) {
        Adress = adress;
    }

    public ArrayList<Specialization_Section> getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(ArrayList<Specialization_Section> specialization) {
        Specialization = specialization;
    }
}
