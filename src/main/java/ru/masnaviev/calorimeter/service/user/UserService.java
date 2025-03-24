package ru.masnaviev.calorimeter.service.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.dto.user.response.UserCreateResponse;

public interface UserService {
    UserCreateResponse createUser(UserCreateRequest request);
}
