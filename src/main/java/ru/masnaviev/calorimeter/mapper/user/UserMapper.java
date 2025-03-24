package ru.masnaviev.calorimeter.mapper.user;

import ru.masnaviev.calorimeter.dto.user.request.UserCreateRequest;
import ru.masnaviev.calorimeter.dto.user.response.UserCreateResponse;
import ru.masnaviev.calorimeter.model.Goal;
import ru.masnaviev.calorimeter.model.User;

public class UserMapper {

    public static User mapUserCreateRequestToUser(UserCreateRequest request) {
        return User.builder()
                .id(request.getId())
                .name(request.getName())
                .email(request.getEmail())
                .age(request.getAge())
                .weight(request.getWeight())
                .height(request.getHeight())
                .goal(Goal.valueOf(request.getGoal()))
                .build();
    }

    public static UserCreateResponse mapUserToUserCreateResponse(User user) {
        return UserCreateResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .goal(user.getGoal().name())
                .build();
    }
}
