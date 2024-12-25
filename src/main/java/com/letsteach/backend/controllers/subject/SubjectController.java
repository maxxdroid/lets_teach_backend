package com.letsteach.backend.controllers.subject;

import com.letsteach.backend.dto.SubjectDto;
import com.letsteach.backend.service.subject.SubjectService;
import com.letsteach.backend.service.subject.SubjectServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subject")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @GetMapping
    public ResponseEntity<List<SubjectDto>> getSubjects() {
        return ResponseEntity.ok(subjectService.findAll());
    }

    @GetMapping("core")
    public ResponseEntity<List<SubjectDto>> getCoreSubjects() {
        return ResponseEntity.ok(subjectService.getCore());
    }

    @GetMapping("elective")
    public ResponseEntity<List<SubjectDto>> getElectiveSubjects() {
        return ResponseEntity.ok(subjectService.findAll());
    }

}
