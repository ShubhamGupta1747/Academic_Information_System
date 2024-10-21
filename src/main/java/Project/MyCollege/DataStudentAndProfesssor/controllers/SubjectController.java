package Project.MyCollege.DataStudentAndProfesssor.controllers;

import Project.MyCollege.DataStudentAndProfesssor.entities.SubjectEntity;
import Project.MyCollege.DataStudentAndProfesssor.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;


    @GetMapping("/getAll")
    public List<SubjectEntity> getAllSubject() {
        return subjectService.getAllSubject();
    }


    @GetMapping("/getSubjectById")
    public Optional<SubjectEntity> getSubjectById(@RequestParam Long id){
        return subjectService.getSubjectWithId(id);
    }


    @PostMapping("/deleteSubjectById")
    public String deleteSubjectById(@RequestParam Long id){
        return subjectService.deleteSubjectById(id);
    }


    @PostMapping("/addSubject")
    public SubjectEntity addSubject(@RequestBody SubjectEntity subject){
        return subjectService.addSubject(subject);
    }


    @PostMapping("/getSubjectsById")
    public List<SubjectEntity> getSubjectsById(@RequestBody List<Long> id){
        return subjectService.getSubjectsById(id);
    }


    @GetMapping("/deleteAllByIds")
    public String deleteAllByIds(@RequestBody List<Long> id){
        subjectService.deleteAllByIds(id);
        return "delete in data base all id which you given me in list";
    }


}
