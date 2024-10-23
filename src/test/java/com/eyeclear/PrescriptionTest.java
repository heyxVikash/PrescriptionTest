package com.eyeclear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrescriptionTest {

    @Test
    public void testValidPrescription() {
        // Create a Prescription object and set valid data
        Prescription prescription = new Prescription();
        prescription.setFirstName("John");
        prescription.setLastName("Smith");
        prescription.setAddress("123 Main St, Suburb, 12345, Australia");
        prescription.setSphere(1.50f);
        prescription.setCylinder(-1.75f);
        prescription.setAxis(90);
        prescription.setExaminationDate("21/10/2024");
        prescription.setOptometrist("Dr. Optometrist");

        // Check if the prescription is valid
        assertTrue(prescription.addPrescription(), "Prescription should be added successfully.");
    }

    @Test
    public void testInvalidFirstNameTooShort() {
        // Create a Prescription object and set invalid data
        Prescription prescription = new Prescription();
        prescription.setFirstName("J");  // Invalid first name (too short)
        prescription.setLastName("Smith");
        prescription.setAddress("123 Main St, Suburb, 12345, Australia");
        prescription.setSphere(1.50f);
        prescription.setCylinder(-1.75f);
        prescription.setAxis(90);
        prescription.setExaminationDate("21/10/2024");
        prescription.setOptometrist("Dr. Optometrist");

        // Check if the prescription fails due to an invalid first name
        assertFalse(prescription.addPrescription(), "Prescription should fail due to an invalid first name.");
    }
}
