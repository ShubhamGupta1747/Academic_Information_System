package Project.MyCollege.DataStudentAndProfesssor.repositories;

import Project.MyCollege.DataStudentAndProfesssor.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity,Long> {

}
