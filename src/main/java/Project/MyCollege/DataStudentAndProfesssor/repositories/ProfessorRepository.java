package Project.MyCollege.DataStudentAndProfesssor.repositories;

import Project.MyCollege.DataStudentAndProfesssor.entities.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorEntity,Long> {
}
