package ru.masnaviev.calorimeter.validation.user.create.validators;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.model.Goal;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.Optional;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class UserCreateRequestGoalValidation implements UserCreateRequestValidation {
    @Override
    public Optional<ValidationError> validate(UserCreateRequest request) {
        if (request.getGoal() == null || request.getGoal().isBlank()) {
            return Optional.of(new ValidationError("Goal is required"));
        }

        try {
            Goal.valueOf(request.getGoal().toUpperCase());
            return Optional.empty();
        } catch (IllegalArgumentException e) {
            return Optional.of(new ValidationError("Invalid goal value: " + request.getGoal()));
        }
    }
}