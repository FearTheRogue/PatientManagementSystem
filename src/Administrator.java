public class Administrator {

    private String adminID;
    private String adminName;
    private String adminAddress;

    public Administrator (String adminID, String adminName, String adminAddress) {
        this.adminID = adminID;
        this.adminName = adminName;
        this.adminAddress = adminAddress;
    }

    public Administrator () {

    }

    public String GetAdminID () {
        return this.adminID;
    }

    public String GetAdminName() {
        return this.adminName;
    }

    public String GetAdminAddress() {
        return this.adminAddress;
    }

    public void SetAdminID (String adminID) {
        this.adminID = adminID;
    }

    public void SetAdminName (String adminName) {
        this.adminName = adminName;
    }

    public void SetAdminAddress (String adminAddress) {
        this.adminAddress = adminAddress;
    }
}
