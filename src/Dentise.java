
interface dentiseplan {
    public void setPersonalInformation(String PersonalInformation );
    public void setEducation(String Education );
    public void setspecialization(String specialization);
}

public class Dentise implements dentiseplan {
    private String PersonalInformation;
    private String Education;
    private String specialization;

    @Override
    public void setPersonalInformation(String PersonalInformation) {
        this.PersonalInformation=PersonalInformation;
    }

    @Override
    public void setEducation(String Education) {
        this.Education=Education;
    }

    @Override
    public void setspecialization(String specialization) {
         this.specialization=specialization;
    }
}
