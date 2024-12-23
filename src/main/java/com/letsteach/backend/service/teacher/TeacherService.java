package com.letsteach.backend.service.teacher;


import com.letsteach.backend.dto.TeacherDto;

import java.util.List;

public interface TeacherService {
    List<TeacherDto> findAll();

//    TeacherDto create(TeacherDto teacherDto);
}
