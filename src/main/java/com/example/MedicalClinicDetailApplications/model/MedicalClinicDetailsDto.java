package com.example.MedicalClinicDetailApplications.model;

import lombok.Data;

import java.util.List;

@Data
public class MedicalClinicDetailsDto {
   private List<DoctorDto> doctors;
   private List<PatientDto> patients;
   private List<HospitalDto> hospitals;

   public MedicalClinicDetailsDto(List<DoctorDto> doctors, List<PatientDto> patients, List<HospitalDto> hospitals) {
      this.doctors = doctors;
      this.patients = patients;
      this.hospitals = hospitals;
   }
}
