public class DentistEngineer {
    private Buldier buldier;

    public DentistEngineer(Buldier buldier) {
        this.buldier = buldier;
    }

    public Dentise getDentise(){
        return this.buldier.getDentise();
    }
    public void constructDentist() {
        this.buldier.buildprofile_Doctor();
        this.buldier.buildEducation();
        this.buldier.buildAddress();
        if(this.buldier instanceof SpecialistDentist)
            ((SpecialistDentist) this.buldier).buildSpecializationArea();
    }
}
