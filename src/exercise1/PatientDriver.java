package exercise1;

import javax.swing.JOptionPane;

public class PatientDriver {
    public static void main(String[] args) {

        //Input variables.
        int patientID = 0;
        String firstName;
        String lastName;
        String address;
        String city;
        String province;
        String postalCode;

        //Try to get a valid patient ID.
        boolean validID = false;
        do {
            try {
                patientID = Integer.parseInt(JOptionPane.showInputDialog("Enter your Patient ID."));
                validID = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Patient ID!");
            }
        }
        while (!validID);
        firstName = JOptionPane.showInputDialog("Enter your first name.");
        lastName = JOptionPane.showInputDialog("Enter your last name.");
        address = JOptionPane.showInputDialog("Enter your street address.");
        city = JOptionPane.showInputDialog("Enter your city.");
        province = JOptionPane.showInputDialog("Enter your province.");
        postalCode = JOptionPane.showInputDialog("Enter your postal code.");


        Patient newPatient = new Patient(patientID, firstName, lastName,
                address, city, province, postalCode);

        //Output dialog to display patient information.
        JOptionPane.showMessageDialog(null,
                newPatient.getPatientInfo());
    }
}
