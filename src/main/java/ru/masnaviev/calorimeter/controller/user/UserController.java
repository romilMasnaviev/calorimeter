package ru.masnaviev.calorimeter.controller.user;

import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.dto.user.response.UserCreateResponse;
import ru.masnaviev.calorimeter.service.user.UserService;

@RestController
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class UserController {

    private final UserService userService;

    @PostMapping("/api/users")
    public UserCreateResponse createUser(@RequestBody UserCreateRequest request) {
        return userService.createUser(request);
    }
}
