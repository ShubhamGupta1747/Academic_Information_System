package Project.MyCollege.DataStudentAndProfesssor.controllers;

import Project.MyCollege.DataStudentAndProfesssor.entities.StudentEntity;
import Project.MyCollege.DataStudentAndProfesssor.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
//
    @Autowired
    StudentService studentService;


    //    ADD TABLE
    @PostMapping("/addStudent")
    public StudentEntity addRecord(@RequestBody StudentEntity student) {
        return studentService.addRecord(student);
    }


    @GetMapping("/GetAllStudent")
    public List<StudentEntity> GetAllStudent(){
        return studentService.GetAllStudent();
    }


    @GetMapping("/getStudentById")
    public Optional<StudentEntity> getStudentById(Long id){
        return studentService.getStudentById(id);
    }


    @PostMapping("/DeleteById")
    public String  DeleteById(Long id){
        return studentService.DeleteById(id);
    }


    @PostMapping("/getStudentsById")
    public List<StudentEntity> getStudentsById(@RequestBody List<Long> id){
        return studentService.getStudentsById(id);

    }


    @GetMapping("/deleteAllByIds")
    public String deleteAllByIds(@RequestBody List<Long> id){
        studentService.deleteAllByIds(id);
        return "delete in data base all id which you given me in list";
    }
}
