package com.conveyor.conveyor.dto;

import java.time.LocalDate;

public class FinishRegistrationRequestDTO {
    Enum gender;
    Enum maritalStatus;
    Integer dependentAmount;
    LocalDate passportIssueDate;
    String passportIssueBrach;
    EmploymentDTO employment;
    String account;
}
