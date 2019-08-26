public class education_section {
    private  String Degree ;
    private  String Major ;
    private  String school;
    private int year;
    public education_section(String degree, String major, String school, int year) {
        this.Degree = degree;
        this.Major = major;
        this.school = school;
        this.year = year;
    }
    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getMojor() {
        return Major;
    }

    public void setMojor(String mojor) {
        Major = mojor;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
