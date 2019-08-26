import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Buldier buldier;

        String first_name, last_name, Email, website,  licence_cuntryname, gender, degree, major,
                school, country, state, city, street, postalCode;
        int year_in_practice, year,phone_number,licence_Number;
        ArrayList<education_section> educations = new ArrayList<>();
        ArrayList<Address> addresses = new ArrayList<>();

        char isSpecialist;
        ArrayList<Specialization_Section> Specialization_Section = new ArrayList<>();
        String areaOfSpecialization;
        int startYear;

        System.out.println(" Personal Information ");
        System.out.print("First Name: ");
        first_name = input.next();
        System.out.print("Last Name: ");
        last_name = input.next();
        System.out.print("Email: ");
        Email = input.next();
        System.out.print("Website: ");
        website = input.next();
        System.out.print("Phone Number: ");
        phone_number = input.nextInt();

        // Biography

        System.out.println(" Biography Section ");
        System.out.print("Licence Country Name: ");
        licence_cuntryname = input.next();
        System.out.print("Licence Number: ");
        licence_Number = input.nextInt();
        System.out.print("Years In Practice: ");
        year_in_practice = input.nextInt();
        System.out.print("Gender: ");
        gender = input.next();

        profile_Doctor profile_doctor= new profile_Doctor(first_name, last_name, website,  Email ,   phone_number,  licence_cuntryname, licence_Number , year_in_practice, gender);

        // Education

        System.out.println(" Education Section ");
        System.out.print("Degree: ");
        degree = input.next();
        System.out.print("Major: ");
        major = input.next();
        System.out.print("School: ");
        school = input.next();
        System.out.print("Year: ");
        year = input.nextInt();

        education_section newEducation = new education_section(degree, major, school, year);
        educations.add(newEducation);

        // Addresses

        System.out.println(" Address Section ");
        System.out.print("Country: ");
        country = input.next();
        System.out.print("State: ");
        state = input.next();
        System.out.print("City: ");
        city = input.next();
        System.out.print("Street: ");
        street = input.next();
        System.out.print("Postal Code: ");
        postalCode = input.next();

        Address newAddress = new Address(country, state, city, street, postalCode);
        addresses.add(newAddress);

        // Specialization Areas

        System.out.print("Is Specialist? (Y/N): ");
        isSpecialist = input.next().charAt(0);

        if(isSpecialist == 'Y' || isSpecialist == 'y') {
            System.out.println("<< Specialization Area Section >>");
            System.out.print("Area Of Specialization: ");
            areaOfSpecialization = input.next();
            System.out.print("Start Year: ");
            startYear = input.nextInt();

            Specialization_Section newSpecializationArea = new Specialization_Section(areaOfSpecialization, startYear);
            Specialization_Section.add(newSpecializationArea);

            buldier = new SpecialistDentist(profile_doctor, educations, addresses, Specialization_Section);
        } else {
            buldier = new GeneralDentist(profile_doctor, educations, addresses);
        }

        DentistEngineer dentistEngineer = new DentistEngineer(buldier);
        dentistEngineer.constructDentist();
        Dentise dentist = dentistEngineer.getDentise();

    }
}

