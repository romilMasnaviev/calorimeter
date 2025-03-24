package ru.masnaviev.calorimeter.validation.user.create.validators;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.Optional;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class UserCreateRequestHeightValidation implements UserCreateRequestValidation {
    @Override
    public Optional<ValidationError> validate(UserCreateRequest request) {
        Integer height = request.getHeight();
        return (height == null || height <= 0)
                ? Optional.of(new ValidationError("Height must be greater than 0"))
                : Optional.empty();
    }
}