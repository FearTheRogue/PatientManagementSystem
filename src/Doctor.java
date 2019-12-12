public class Doctor {

    private String doctorID;
    private String doctorName;
    private String doctorAddress;

    public Doctor() {

    }

    public Doctor (String doctorID, String doctorName, String doctorAddress) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.doctorAddress = doctorAddress;
    }

    public String GetDoctorID() {
        return this.doctorID;
    }

    public String GetDoctorName() {
        return this.doctorName;
    }

    public String GetDoctorAddress() {
        return this.doctorAddress;
    }

    public void SetDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public void SetDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void SetDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }
}


