package ru.masnaviev.calorimeter.validation.user.create.validators;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.Optional;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class UserCreateRequestAgeValidation implements UserCreateRequestValidation {
    @Override
    public Optional<ValidationError> validate(UserCreateRequest request) {
        Integer age = request.getAge();
        return (age == null || age < 0 || age > 120)
                ? Optional.of(new ValidationError("Invalid age: must be between 0 and 120"))
                : Optional.empty();
    }
}