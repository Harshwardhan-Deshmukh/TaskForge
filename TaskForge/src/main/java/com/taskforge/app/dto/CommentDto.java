package com.taskforge.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentDto {

    private Long id;

    @NotBlank(message = "content is a required field for Comment")
    @Max(value = 150, message = "Maximum 150 characters are allowed in Comment content.")
    private String content;

    @JsonFormat(pattern = "hh:mm:ss dd:MM:yyyy")
    private LocalDateTime createdAt;

    private TaskDto task;
    private UserDto user;

}
