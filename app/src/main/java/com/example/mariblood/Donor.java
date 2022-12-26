package com.example.mariblood;

public class Donor {

    String hospitalName, hospitalNumber, donorName, donorAge, donorDate;
    String donorId;
    String bloodType;

    public Donor() {

    }

    public Donor(String hospitalName, String hospitalNumber, String donorName, String donorAge, String donorDate, String donorId, String bloodType) {
        this.hospitalName = hospitalName;
        this.hospitalNumber = hospitalNumber;
        this.donorName = donorName;
        this.donorAge = donorAge;
        this.donorDate = donorDate;
        this.donorId = donorId;
        this.bloodType = bloodType;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(String hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(String donorAge) {
        this.donorAge = donorAge;
    }

    public String getDonorDate() {
        return donorDate;
    }

    public void setDonorDate(String donorDate) {
        this.donorDate = donorDate;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
