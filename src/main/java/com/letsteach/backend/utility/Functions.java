package com.letsteach.backend.utility;

import com.letsteach.backend.dto.SubjectDto;
import com.letsteach.backend.dto.TeacherDto;
import com.letsteach.backend.entity.Subject;
import com.letsteach.backend.entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public class Functions {

    public SubjectDto subjectToDto (Subject subject) {
        return SubjectDto
                .builder()
                .id(subject.getId())
                .name(subject.getName())
                .image(subject.getImage())
//                .teacher(teacherToDto(subject.getTeacher()))
                .build();
    }

//    public TeacherDto teacherToDto (Teacher teacher) {
//        return TeacherDto
//                .builder()
//                .id(teacher.getId())
//                .name(teacher.getName())
//                .profileImage(teacher.getProfileImage())
//                .build();
//    }
}
