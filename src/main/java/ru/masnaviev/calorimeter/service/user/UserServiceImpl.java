package ru.masnaviev.calorimeter.service.user;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.dto.user.response.UserCreateResponse;
import ru.masnaviev.calorimeter.mapper.user.UserMapper;
import ru.masnaviev.calorimeter.model.User;
import ru.masnaviev.calorimeter.repository.UserRepository;
import ru.masnaviev.calorimeter.validation.ValidationError;
import ru.masnaviev.calorimeter.validation.user.create.UserCreateRequestValidator;

import java.util.List;

@Service
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class UserServiceImpl implements UserService {

    private final UserCreateRequestValidator validator;
    private final UserRepository repository;

    @Override
    public UserCreateResponse createUser(UserCreateRequest request) {
        List<ValidationError> errors = validator.validateUserCreateRequest(request);
        if (errors.isEmpty()) {
            User savedUser = repository.save(UserMapper.mapUserCreateRequestToUser(request));
            return buildUserCreateResponse(savedUser);
        } else {
            return buildUserCreateResponse(errors);
        }
    }

    private UserCreateResponse buildUserCreateResponse(List<ValidationError> errors) {
        UserCreateResponse response = new UserCreateResponse();
        response.setErrors(errors);
        return response;
    }

    private UserCreateResponse buildUserCreateResponse(User user) {
        return UserMapper.mapUserToUserCreateResponse(user);
    }
}
