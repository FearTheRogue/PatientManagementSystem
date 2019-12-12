import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Doctor doctor1 = new Doctor("TYRUE1", "John Doe", "4 Pavillion Drive");

        Doctor doctor2 = new Doctor();
        doctor2.SetDoctorID("12345");
        doctor2.SetDoctorName("Jane Doe");
        doctor2.SetDoctorAddress("Plymouth Plymouth");

        System.out.println(doctor1.GetDoctorID());
        System.out.println(doctor1.GetDoctorName());
        System.out.println(doctor1.GetDoctorAddress());

        System.out.println("ID: " + doctor2.GetDoctorID() + " Name: " + doctor2.GetDoctorName() + " Lives at: " + doctor2.GetDoctorAddress());

        Administrator administrator1 = new Administrator();
        administrator1.SetAdminID("6789");
        administrator1.SetAdminName("Carrie Fisher");
        administrator1.SetAdminAddress("Plymouth");

        System.out.println("Admin ID: " + administrator1.GetAdminID());
        System.out.println("Admin Name: " + administrator1.GetAdminName());
        System.out.println("Admin Address: " + administrator1.GetAdminAddress());


    }
}
