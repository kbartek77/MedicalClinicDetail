package com.example.MedicalClinicDetailApplications.controller;

import com.example.MedicalClinicDetailApplications.client.MedicalClinicClient;
import com.example.MedicalClinicDetailApplications.model.MedicalClinicDetailsDto;
import com.example.MedicalClinicDetailApplications.service.MedicalClinicDetailsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MedicalClinicsDetailsController {
    private final MedicalClinicDetailsService medicalClinicDetailsService;

    @Operation(summary = "Show all doctors, all patients and all hospitals", tags = "Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "500", description = "Medical service server error", content = @Content)
    })
    @GetMapping("/details")
    public MedicalClinicDetailsDto getDetails() {
        return medicalClinicDetailsService.showAllDetails();
    }

}

