package com.example.email.dto;

import com.example.email.models.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmailPrescriptionDTO{
    private String doctor;
    private String patient;
    private String medicineName;
    private int dosage;
    private Status status;
    private String patientEmail;
}

