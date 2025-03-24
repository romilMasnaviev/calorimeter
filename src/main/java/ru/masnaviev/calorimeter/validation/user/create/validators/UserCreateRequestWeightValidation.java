package ru.masnaviev.calorimeter.validation.user.create.validators;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.Optional;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class UserCreateRequestWeightValidation implements UserCreateRequestValidation {
    @Override
    public Optional<ValidationError> validate(UserCreateRequest request) {
        Float weight = request.getWeight();
        return (weight == null || weight <= 0)
                ? Optional.of(new ValidationError("Weight must be greater than 0"))
                : Optional.empty();
    }
}