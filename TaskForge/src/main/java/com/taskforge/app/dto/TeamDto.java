package com.taskforge.app.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeamDto {

    private Long id;

    @NotBlank(message = "name is a required field for Team")
    private String name;

    @Max(value = 150, message = "Maximum of 150 characters allowed in Team description.")
    private String description;

    private List<TaskDto> tasks;

    private List<UserDto> users;
}
