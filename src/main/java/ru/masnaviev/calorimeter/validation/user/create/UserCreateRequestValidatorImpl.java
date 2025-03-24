package ru.masnaviev.calorimeter.validation.user.create;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.validation.ValidationError;
import ru.masnaviev.calorimeter.validation.user.create.validators.UserCreateRequestValidation;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class UserCreateRequestValidatorImpl implements UserCreateRequestValidator {

    private final List<UserCreateRequestValidation> validations;

    @Override
    public List<ValidationError> validateUserCreateRequest(UserCreateRequest request) {
        List<ValidationError> errors = new ArrayList<>();

        for (var validation : validations) {
            validation.validate(request).ifPresent(errors::add);
            errors.addAll(validation.validateList(request));
        }

        return errors;
    }
}
