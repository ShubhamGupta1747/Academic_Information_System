package Project.MyCollege.DataStudentAndProfesssor.services;


import Project.MyCollege.DataStudentAndProfesssor.entities.StudentEntity;
import Project.MyCollege.DataStudentAndProfesssor.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //Add Subject
    public StudentEntity addRecord(StudentEntity student) {
        return studentRepository.save(student);
    }


    public List<StudentEntity> GetAllStudent() {
        return studentRepository.findAll();
    }


    public Optional<StudentEntity> getStudentById(Long id) {
        return studentRepository.findById(id);
    }


    public String DeleteById(Long id) {
        studentRepository.deleteById(id);
        return "this id "+id+" is delete from database";
    }

    public List<StudentEntity> getStudentsById(List<Long> id) {
        return studentRepository.findAllById(id);
    }

    @GetMapping("/deleteAllByIds")
    public void deleteAllByIds(@RequestBody List<Long> id) {
        studentRepository.deleteAllById(id);
    }
}
