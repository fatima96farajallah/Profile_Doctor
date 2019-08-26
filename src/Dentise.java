import java.util.ArrayList;

interface dentiseplan {
    public void setprofile_Doctor(profile_Doctor profile_doctor );
    public void seteducation_section(ArrayList<education_section> education_section );
    public void setAddress(ArrayList<Address> address);
    public void setSpecialization_section(ArrayList<Specialization_Section> Specialization_section);

}

public class Dentise implements dentiseplan {
    private profile_Doctor profile_doctor;
    private ArrayList<education_section> education_section;
    private ArrayList<Address> address;
    private ArrayList<Specialization_Section> Specialization_section;


    @Override
    public void setprofile_Doctor(profile_Doctor profile_doctor) {
        this.profile_doctor=profile_doctor;
    }

    @Override
    public void seteducation_section(ArrayList<education_section> Education) {
this.education_section=education_section;
    }

    @Override
    public void setAddress(ArrayList<Address> address) {
this.address=address;
    }

    @Override
    public void setSpecialization_section(ArrayList<Specialization_Section> Specialization_section) {
        this.Specialization_section=Specialization_section;
    }

    public profile_Doctor getProfile_doctor() {
        return profile_doctor;
    }

    public ArrayList<education_section> getEducation_section() {
        return education_section;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public ArrayList<Specialization_Section> getSpecialization_section() {
        return Specialization_section;
    }
}
