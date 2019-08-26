import java.util.ArrayList;

interface Buldier {
    public void buildprofile_Doctor();
    public void buildEducation();
    public void buildAddress();
    public Dentise getDentise();
}
 class SpecialistDentist implements Buldier {
    private Dentise dentise;
    private profile_Doctor profile_doctor;
    private ArrayList<education_section> education_section;
    private ArrayList<Address> address;
    private ArrayList<Specialization_Section> Specialization_section;
    public SpecialistDentist(profile_Doctor profile_doctor, ArrayList<education_section> education_section, ArrayList<Address> addresse, ArrayList<Specialization_Section> Specialization_section) {
        this.dentise = new Dentise();
        this.profile_doctor= profile_doctor;
        this.education_section=education_section;
        this.address=addresse;
        this.Specialization_section=Specialization_section;
    }

    @Override
    public void buildprofile_Doctor() {
     dentise.setprofile_Doctor(profile_doctor);
    }

    @Override
    public void buildEducation() {
dentise.seteducation_section(education_section);
    }

    @Override
    public void buildAddress() {
dentise.setAddress(address);
    }
    public void buildSpecializationArea() {
        dentise.setSpecialization_section(Specialization_section);
    }
    @Override
    public Dentise getDentise() {
        return dentise;
    }
}
class  GeneralDentist implements Buldier{
    private Dentise dentise;
    private profile_Doctor profile_doctor;
    private ArrayList<education_section> education_section;
    private ArrayList<Address> address;
    public GeneralDentist(profile_Doctor profile_doctor, ArrayList<education_section> education_section, ArrayList<Address> addresse) {
        this.dentise = new Dentise();
        this.profile_doctor= profile_doctor;
        this.education_section=education_section;
        this.address=addresse;
    }

    @Override
    public void buildprofile_Doctor() {
        dentise.setprofile_Doctor(profile_doctor);
    }

    @Override
    public void buildEducation() {
dentise.seteducation_section(education_section);
    }

    @Override
    public void buildAddress() {
dentise.setAddress(address);
    }

    @Override
    public Dentise getDentise() {
        return this.dentise;
    }
}


