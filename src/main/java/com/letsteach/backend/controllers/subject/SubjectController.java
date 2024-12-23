package com.letsteach.backend.controllers.subject;

import com.letsteach.backend.dto.SubjectDto;
import com.letsteach.backend.service.subject.SubjectServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subject")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectServiceImpl subjectService;

    @GetMapping
    public ResponseEntity<List<SubjectDto>> getSubjects() {
        return ResponseEntity.ok(subjectService.findAll());
    }

//    @PostMapping
//    public ResponseEntity<SubjectDto> createSubject(@RequestBody SubjectDto subject) {
//        return  ResponseEntity.ok(subjectService.create(subject));
//    }
}
