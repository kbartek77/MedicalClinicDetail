package com.example.MedicalClinicDetailApplications.model;

import lombok.Data;

@Data
public class HospitalDto {
    private Long id;
    private String name;
    private String town;
    private String postalCode;
    private String street;
    private String numberOfBuilding;
}
