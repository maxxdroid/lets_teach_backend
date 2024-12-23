package com.letsteach.backend.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubjectDto {
    private Long id;

    private String name;
    private String description;
    private String image;

    private int students;
    private int prices;
    private String time;

    private String teacher;
    private String type;
}
