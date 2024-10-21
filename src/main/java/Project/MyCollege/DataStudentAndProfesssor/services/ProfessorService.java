package Project.MyCollege.DataStudentAndProfesssor.services;

import Project.MyCollege.DataStudentAndProfesssor.entities.ProfessorEntity;
import Project.MyCollege.DataStudentAndProfesssor.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
        @Autowired
        ProfessorRepository professorRepository;



        public ProfessorEntity addData(ProfessorEntity professor) {
                return professorRepository.save(professor);
        }


        public List<ProfessorEntity> GetAll() {
                return professorRepository.findAll();
        }


        public Optional<ProfessorEntity> GetDataByID(Long id) {
                return professorRepository.findById(id);
        }


        public String deleteById(Long id) {
                professorRepository.deleteById(id);
                return "Id "+id+" is delete in database.";
        }

        public void deleteAllByIds(List<Long> id) {
                professorRepository.deleteAll();
        }

        public List<ProfessorEntity> getProfessorsBYId(List<Long> id) {
                return professorRepository.findAllById(id);
        }
}
