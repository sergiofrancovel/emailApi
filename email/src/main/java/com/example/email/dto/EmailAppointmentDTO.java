package com.example.email.dto;


import lombok.*;

import java.util.Date;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailAppointmentDTO {
    private String patientEmail;
    private String doctorfn;
    private String patientfn;
    private String patientln;
    private String schedule;
    private Date appointmentTime;
}
