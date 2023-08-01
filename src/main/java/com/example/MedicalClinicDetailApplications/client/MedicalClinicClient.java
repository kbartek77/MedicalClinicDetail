package com.example.MedicalClinicDetailApplications.client;

import com.example.MedicalClinicDetailApplications.model.DoctorDto;
import com.example.MedicalClinicDetailApplications.model.HospitalDto;
import com.example.MedicalClinicDetailApplications.model.PatientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "Medical", url = "localhost:8080")
public interface MedicalClinicClient {
    @RequestMapping(method = RequestMethod.GET, value = "/doctors")
    List<DoctorDto> showAllDoctors();
    @RequestMapping(method = RequestMethod.GET, value = "/patients")
    List<PatientDto> showAllPatients();
    @RequestMapping(method = RequestMethod.GET, value = "/hospitals")
    List<HospitalDto> showAllHospitals();
}
