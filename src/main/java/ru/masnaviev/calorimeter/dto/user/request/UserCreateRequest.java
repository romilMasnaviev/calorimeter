package ru.masnaviev.calorimeter.dto.user.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserCreateRequest {
    private String id;
    private String name;
    private String email;
    private Integer age;
    private Float weight;
    private Integer height;
    private String goal;
}
