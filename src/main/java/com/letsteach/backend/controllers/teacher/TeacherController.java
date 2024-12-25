package com.letsteach.backend.controllers.teacher;

import com.letsteach.backend.dto.TeacherDto;
import com.letsteach.backend.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("teacher")
@RequiredArgsConstructor
//@CrossOrigin(origins = "*")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<TeacherDto>> getTeachers() {
        return ResponseEntity.ok(teacherService.findAll());
    }

//    @PostMapping
//    public ResponseEntity<TeacherDto> createTeacher(@RequestBody TeacherDto teacher) {
//        return  ResponseEntity.ok(teacherService.create(teacher));
//    }

}
