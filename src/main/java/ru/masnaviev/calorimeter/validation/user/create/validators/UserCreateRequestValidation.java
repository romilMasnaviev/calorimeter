package ru.masnaviev.calorimeter.validation.user.create.validators;

import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface UserCreateRequestValidation {

    default Optional<ValidationError> validate(UserCreateRequest request) {
        return Optional.empty();
    }

    default List<ValidationError> validateList(UserCreateRequest request) {
        return Collections.emptyList();
    }
}
