public class Specialization_Section {
    private String Area_of_Specialization;
    private int Start_year;
    public Specialization_Section(String areaOfSpecialization, int startYear) {
        this.Area_of_Specialization = areaOfSpecialization;
        this.Start_year = startYear;
    }
    public String getArea_of_Specialization() {
        return Area_of_Specialization;
    }

    public void setArea_of_Specialization(String area_of_Specialization) {
        Area_of_Specialization = area_of_Specialization;
    }

    public int getStart_year() {
        return Start_year;
    }

    public void setStart_year(int start_year) {
        Start_year = start_year;
    }
}
