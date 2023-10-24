package com.workintech.fruitapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class PlantErrorResponse {
    private int status;
    private String message;
    private LocalDateTime dateTime;
}
