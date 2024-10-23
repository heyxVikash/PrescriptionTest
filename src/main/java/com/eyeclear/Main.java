package com.eyeclear;

public class Main {
    public static void main(String[] args) {
        Prescription prescription = new Prescription();

        // Set valid data for the prescription
        prescription.setFirstName("John");
        prescription.setLastName("Smith");  // Valid last name
        prescription.setAddress("123 Main St, Suburb, 12345, Australia");
        prescription.setSphere(1.50f);
        prescription.setCylinder(-1.75f);
        prescription.setAxis(90);
        prescription.setExaminationDate("21/10/2024");
        prescription.setOptometrist("Dr. Optometrist");

        // Test adding a prescription
        boolean isAdded = prescription.addPrescription();
        System.out.println("Prescription added: " + isAdded);

        // Test adding a valid remark with at least 6 words
        boolean isRemarkAdded = prescription.addRemark("This is a valid and important remark that satisfies the condition.", "Client");
        System.out.println("Remark added: " + isRemarkAdded);
    }
}
