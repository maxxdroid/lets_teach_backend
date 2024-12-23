package com.letsteach.backend.dto;

import com.letsteach.backend.entity.Subject;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeacherDto {
    private Long id;

    private String name;

    private int subjectNumber;
    private String subject;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private String city;
    private String profileImage;
}
