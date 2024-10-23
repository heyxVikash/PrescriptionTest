package com.eyeclear;

import java.util.ArrayList;
import java.util.List;

public class Prescription {

    private String firstName;
    private String lastName;
    private String address;
    private float sphere;
    private float cylinder;
    private int axis;
    private String examinationDate;
    private String optometrist;
    private List<String> postRemarks = new ArrayList<>();

    // Setters for prescription data
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSphere(float sphere) {
        this.sphere = sphere;
    }

    public void setCylinder(float cylinder) {
        this.cylinder = cylinder;
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }

    public void setExaminationDate(String examinationDate) {
        this.examinationDate = examinationDate;
    }

    public void setOptometrist(String optometrist) {
        this.optometrist = optometrist;
    }

    // Method to add a prescription with validation
    public boolean addPrescription() {
        if (firstName.length() < 4 || lastName.length() < 4) {
            return false; // Invalid if first or last name is too short
        }
        return true; // Valid prescription
    }

    // Method to add a remark with validation for at least 6 words
    public boolean addRemark(String remark, String remarkType) {
        if (remark.split(" ").length < 6) {
            return false; // Invalid if remark has fewer than 6 words
        }
        postRemarks.add(remark); // Add remark to the list
        return true; // Valid remark
    }
}
