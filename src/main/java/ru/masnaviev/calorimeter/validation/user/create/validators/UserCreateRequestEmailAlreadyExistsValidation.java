package ru.masnaviev.calorimeter.validation.user.create.validators;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.repository.UserRepository;
import ru.masnaviev.calorimeter.validation.ValidationError;

import java.util.Optional;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class UserCreateRequestEmailAlreadyExistsValidation implements UserCreateRequestValidation {

    private final UserRepository userRepository;

    @Override
    public Optional<ValidationError> validate(UserCreateRequest request) {
        return userRepository.existsByEmail(request.getEmail()) ?
                Optional.of(new ValidationError("Email already exists")) :
                Optional.empty();
    }
}
