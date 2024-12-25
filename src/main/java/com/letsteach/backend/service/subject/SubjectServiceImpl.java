package com.letsteach.backend.service.subject;

import com.letsteach.backend.dto.SubjectDto;
import com.letsteach.backend.entity.Subject;
import com.letsteach.backend.entity.Teacher;
import com.letsteach.backend.repository.SubjectRepository;
import com.letsteach.backend.repository.TeacherRepository;
import com.letsteach.backend.utility.TeacherFunctions;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    private final TeacherRepository teacherRepository;
    private final TeacherFunctions teacherFunctions;

    @Override
    public List<SubjectDto> findAll() {
        List<Subject> subjects = subjectRepository.findAll();
        return subjects.stream().map(
                subject -> SubjectDto
                        .builder()
                        .id(subject.getId())
                        .name(subject.getName())
                        .image(subject.getImage())
                        .time(subject.getTime())
                        .teacher(subject.getTeacher())
                        .prices(subject.getPrices())
                        .students(subject.getStudents())
                        .build()).toList();
    }

    @Override
    public List<SubjectDto> getCore() {
        List<Subject> subjects = subjectRepository.findByType("core");
        return subjects.stream().map(
                subject -> SubjectDto
                        .builder()
                        .id(subject.getId())
                        .name(subject.getName())
                        .image(subject.getImage())
                        .time(subject.getTime())
                        .teacher(subject.getTeacher())
                        .prices(subject.getPrices())
                        .students(subject.getStudents())
                        .build()).toList();
    }

//    @Override
//    public SubjectDto create(SubjectDto subjectDto) {
//        Teacher teacher = teacherRepository.findById(subjectDto.getTeacher().getId()).orElse(null);
//        if (teacher == null) {
//            return null;
//        }
//        Subject subject = Subject
//                .builder()
//                .name(subjectDto.getName())
//                .image(subjectDto.getImage())
//                .time(subjectDto.getTime())
//                .teacher(teacher)
//                .prices(subjectDto.getPrices())
//                .students(subjectDto.getStudents())
//                .build();
//        subject = subjectRepository.save(subject);
//        return SubjectDto
//                .builder()
//                .id(subject.getId())
//                .name(subject.getName())
//                .image(subject.getImage())
//                .time(subject.getTime())
//                .teacher(teacherFunctions.teacherToDto(teacher))
//                .prices(subject.getPrices())
//                .students(subject.getStudents())
//                .build();
//    }
}
