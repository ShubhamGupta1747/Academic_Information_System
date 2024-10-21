package Project.MyCollege.DataStudentAndProfesssor.repositories;

import Project.MyCollege.DataStudentAndProfesssor.entities.AdmissionRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionRecordRepository extends JpaRepository<AdmissionRecordEntity,Long> {

}
