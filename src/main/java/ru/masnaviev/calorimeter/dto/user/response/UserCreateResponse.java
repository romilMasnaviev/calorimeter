package ru.masnaviev.calorimeter.dto.user.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import ru.masnaviev.calorimeter.dto.ResponseCore;
import ru.masnaviev.calorimeter.model.Goal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateResponse extends ResponseCore {
    private String id;
    private String name;
    private String email;
    private String goal;
}
