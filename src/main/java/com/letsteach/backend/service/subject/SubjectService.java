package com.letsteach.backend.service.subject;

import com.letsteach.backend.dto.SubjectDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectService {
    List<SubjectDto> findAll();

//    SubjectDto create(SubjectDto subjectDto);
}
