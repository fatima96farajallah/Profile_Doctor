public class Specialization_Section {
    private String Area_of_Specialization;
    private String Start_year;

    public String getArea_of_Specialization() {
        return Area_of_Specialization;
    }

    public void setArea_of_Specialization(String area_of_Specialization) {
        Area_of_Specialization = area_of_Specialization;
    }

    public String getStart_year() {
        return Start_year;
    }

    public void setStart_year(String start_year) {
        Start_year = start_year;
    }
    @Override
    public String toString() {
        return "Specialization_Section{" + "Area_of_Specialization=" + Area_of_Specialization + ", Start_year=" + Start_year + '}';
    }
}
