package com.example.MedicalClinicDetailApplications.model;

import lombok.Data;

@Data
public class DoctorDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String specialization;
    private String email;
    private String password;
    private HospitalDto hospitalDto;
}
