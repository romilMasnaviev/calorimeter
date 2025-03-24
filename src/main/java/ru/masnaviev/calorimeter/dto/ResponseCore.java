package ru.masnaviev.calorimeter.dto;

import lombok.Setter;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.List;

@Setter
public class ResponseCore {
    public List<ValidationError> errors;
}
