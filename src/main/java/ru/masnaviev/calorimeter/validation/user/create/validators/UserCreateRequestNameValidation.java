package ru.masnaviev.calorimeter.validation.user.create.validators;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.Optional;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class UserCreateRequestNameValidation implements UserCreateRequestValidation {
    @Override
    public Optional<ValidationError> validate(UserCreateRequest request) {
        return (request.getName() == null || request.getName().isBlank())
                ? Optional.of(new ValidationError("Name is required"))
                : Optional.empty();
    }
}
