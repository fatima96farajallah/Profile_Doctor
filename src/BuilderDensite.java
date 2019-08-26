import java.util.Scanner;

interface Buldier {
    public void buildPersonalInformation();

    public void buildEducation();

    public void buildspecialization();

    public Dentise getDentise();

}
public class BuilderDensite implements Buldier {
    private Dentise Dentise;
    public BuilderDensite (){
        this.Dentise= new Dentise();
    }

    @Override
    public void buildPersonalInformation() {
        Dentise.setPersonalInformation("First Name = ");
        Dentise.setPersonalInformation("Last Name  = ");
        Dentise.setPersonalInformation("E-mail = ");
        Dentise.setPersonalInformation("Website = ");
        Dentise.setPersonalInformation("Phone_number = ");
        Dentise.setPersonalInformation("License Country Name = ");
        Dentise.setPersonalInformation("License Number = ");
        Dentise.setPersonalInformation("Years in Practice = ");
        Dentise.setPersonalInformation("Gender = ");
    }

    @Override
    public void buildEducation() {
        Dentise.setEducation("Degree = " );
        Dentise.setEducation("Mojor = ");
        Dentise.setEducation("school = ");
        Dentise.setEducation("year = ");
    }

    @Override
    public void buildspecialization() {
        Dentise.setspecialization("Area_of_Specialization = ");
        Dentise.setspecialization("Start_year = ");
    }

    @Override
    public Dentise getDentise() {
        return this.getDentise();
    }
}
class TipiDentiseBuilder implements Buldier{
    private Dentise Dentise;
    public TipiDentiseBuilder (){
        this.Dentise= new Dentise();
    }

    @Override
    public void buildPersonalInformation() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Degree = ");
        int degree = keyboard.nextInt();

        Dentise.setPersonalInformation("");

    }

    @Override
    public void buildEducation() {

    }

    @Override
    public void buildspecialization() {

    }

    @Override
    public Dentise getDentise() {
        return this.Dentise;
    }
}
