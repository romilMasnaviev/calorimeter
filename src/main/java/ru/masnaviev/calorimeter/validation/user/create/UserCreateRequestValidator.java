package ru.masnaviev.calorimeter.validation.user.create;

import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.List;

public interface UserCreateRequestValidator {

    List<ValidationError> validateUserCreateRequest(UserCreateRequest request);
}
