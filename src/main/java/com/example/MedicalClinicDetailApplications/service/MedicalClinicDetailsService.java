package com.example.MedicalClinicDetailApplications.service;

import com.example.MedicalClinicDetailApplications.client.MedicalClinicClient;
import com.example.MedicalClinicDetailApplications.model.DoctorDto;
import com.example.MedicalClinicDetailApplications.model.HospitalDto;
import com.example.MedicalClinicDetailApplications.model.MedicalClinicDetailsDto;
import com.example.MedicalClinicDetailApplications.model.PatientDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalClinicDetailsService {
    private final MedicalClinicClient medicalClinicClient;

    public MedicalClinicDetailsDto showAllDetails() {
        List<DoctorDto> doctors = medicalClinicClient.showAllDoctors();
        List<PatientDto> patients = medicalClinicClient.showAllPatients();
        List<HospitalDto> hospitals = medicalClinicClient.showAllHospitals();

        return new MedicalClinicDetailsDto(doctors, patients, hospitals);
    }

}
