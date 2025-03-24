package ru.masnaviev.calorimeter.validation;

public record ValidationError(String description) {
    @Override
    public String toString() {
        return "ValidationError{" +
                "description='" + description + '\'' +
                '}';
    }
}
