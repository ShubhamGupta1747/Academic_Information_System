package Project.MyCollege.DataStudentAndProfesssor.services;

import Project.MyCollege.DataStudentAndProfesssor.entities.SubjectEntity;
import Project.MyCollege.DataStudentAndProfesssor.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;


    //getAllSubject
    public List<SubjectEntity> getAllSubject(){
        return subjectRepository.findAll();
    }


    //Add Subject
    public SubjectEntity addSubject(SubjectEntity subject){
        return subjectRepository.save(subject);
    }


    //get a subject with id
    public Optional<SubjectEntity> getSubjectWithId(Long id){
        return subjectRepository.findById(id);

    }


    public String deleteSubjectById(Long id){
        subjectRepository.deleteById(id);
        return "Id"+id+"successfully deleted";
    }


    public List<SubjectEntity> getSubjectsById(List<Long> id) {
        return subjectRepository.findAllById(id);
    }

    public void deleteAllByIds(List<Long> id) {
        subjectRepository.deleteAllById(id);
    }
}
