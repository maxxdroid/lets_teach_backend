package com.letsteach.backend.service.teacher;

import com.letsteach.backend.dto.TeacherDto;
import com.letsteach.backend.entity.Teacher;
import com.letsteach.backend.repository.TeacherRepository;
import com.letsteach.backend.utility.Functions;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    private final Functions userFunctions;

    @Override
    public List<TeacherDto> findAll() {
        List<Teacher> teachers = teacherRepository.findAll();
        return teachers.stream().map(
                teacher -> TeacherDto
                        .builder()
                        .id(teacher.getId())
                        .name(teacher.getName())
                        .subject(teacher.getSubject())
                        .profileImage(teacher.getProfileImage())
                        .build()
        ).toList();
    }

//    @Override
//    public TeacherDto create(TeacherDto teacherDto) {
//        Teacher teacher = Teacher
//                .builder()
//                .name(teacherDto.getName())
//                .age(teacherDto.getAge())
//                .profileImage(teacherDto.getProfileImage())
//                .build();
//        teacherRepository.save(teacher);
//        return null;
//    }
}
