package ru.masnaviev.calorimeter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private Integer age;
    private Float weight;
    private Integer height;
    private Goal goal;
}