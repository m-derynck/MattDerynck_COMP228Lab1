package exercise1;

public class Patient {
    //Properties
    private int patientID;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String province;
    private String postalCode;

    //Getters and Setters.
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Patient() {
    }

    public Patient(int patientID, String firstName,
                   String lastName, String address,
                   String city, String province,
                   String postalCode) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    //Returns patient information as a string
    public String getPatientInfo() {

        String patientInfo = String.format("PatientID: %s%nName: %s %s%nAddress: %s%nCity: %s%nProvince: %s%nPostal Code: %s",
                getPatientID(),getFirstName(),getLastName(),getAddress(),getCity(),getProvince(),getPostalCode());

        return patientInfo;
    }
}
